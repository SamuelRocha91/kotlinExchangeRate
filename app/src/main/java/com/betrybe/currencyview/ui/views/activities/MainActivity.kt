package com.betrybe.currencyview.ui.views.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.currencyview.common.ApiIdlingResource
import com.betrybe.currencyview.data.api.ApiLayer
import com.betrybe.currencyview.ui.adapters.RateAdapter
import com.betrye.currencyview.BuildConfig
import com.betrye.currencyview.R
import com.google.android.material.textview.MaterialTextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

class MainActivity : AppCompatActivity() {
    private val apiKey = BuildConfig.API_KEY;
    private val apiService = ApiLayer.instance;

    private val loadingCurrency: MaterialTextView by lazy { findViewById(R.id.load_currency_state) }
    private val selectOptions: AutoCompleteTextView by lazy { findViewById(R.id.currency_selection_input_layout) }
    private val selectCurrency: MaterialTextView by lazy { findViewById(R.id.select_currency_state) }
    private val recyclerView: RecyclerView by lazy { findViewById(R.id.currency_rates_state) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fetchCurrencies()
    }

    private fun fetchCurrencies() {
        loadingCurrency.visibility = View.VISIBLE;
        CoroutineScope(Dispatchers.IO).launch {
            try {
                ApiIdlingResource.increment()
                val currenciesSymbols =
                    apiService.getSymbols(apiKey).body()?.symbols?.keys?.toList();
                withContext(Dispatchers.Main) {
                    if (currenciesSymbols != null) {
                        renderCurrenciesOptions(currenciesSymbols)
                    } else {
                        Toast.makeText(
                            baseContext,
                            "Erro no carregamento das moedas. Favor, tente mais tarde.",
                            Toast.LENGTH_LONG
                        ).show()
                    }
                }
                ApiIdlingResource.decrement()
            } catch (e: HttpException) {
                Log.e("ApiError", "Erro na resposta da API", e)
                ApiIdlingResource.decrement()
                Toast.makeText(
                    baseContext,
                    "Erro na comunicação com o servidor. Tente novamente.",
                    Toast.LENGTH_LONG
                ).show()
            } catch (e: IOException) {
                Log.e("NetworkError", "Erro de conectividade", e)
                Toast.makeText(baseContext, "Erro de conectividade", Toast.LENGTH_LONG).show()
                ApiIdlingResource.decrement()
            }
        }
    }

    private fun renderCurrenciesOptions(currencies: List<String>) {
        loadingCurrency.visibility = View.GONE;
        selectCurrency.visibility = View.VISIBLE;
        val adapter = ArrayAdapter(
            baseContext,
            android.R.layout.simple_dropdown_item_1line,
            currencies
        )
        selectOptions.setAdapter(adapter)
        selectOptions.setOnItemClickListener { parent, _, position, _ ->
            handleOptionClickAndRenderRates(parent,  position)
        }
    }

    private fun handleOptionClickAndRenderRates(
        parent: AdapterView<*>,
        position: Int,
    ) {
        val selectedCurrency = parent.getItemAtPosition(position) as String
        CoroutineScope(Dispatchers.IO).launch {
            ApiIdlingResource.increment();
            try {
                val rates = apiService.getRates(apiKey, selectedCurrency).body();
                withContext(Dispatchers.Main) {
                    if (rates != null) {
                        selectCurrency.visibility = View.GONE;
                        recyclerView.layoutManager =
                            LinearLayoutManager(baseContext);
                        recyclerView.adapter = RateAdapter(rates)
                        recyclerView.visibility = View.VISIBLE;
                    } else {
                        Toast.makeText(baseContext, "Por favor, tente novamente", Toast.LENGTH_LONG)
                            .show()
                    }
                    ApiIdlingResource.decrement()
                }
            } catch (e: HttpException) {
                Log.e("ApiError", "Erro na resposta da API", e)
                ApiIdlingResource.decrement()
                Toast.makeText(
                    baseContext,
                    "Erro na comunicação com o servidor. Tente novamente.",
                    Toast.LENGTH_LONG
                ).show()
            } catch (e: IOException) {
                Log.e("NetworkError", "Erro de conectividade", e)
                Toast.makeText(baseContext, "Erro de conectividade", Toast.LENGTH_LONG).show()
                ApiIdlingResource.decrement()
            }
        }
    }
}