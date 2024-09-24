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
                val currenciesSymbols =
                    apiService.getSymbols(apiKey).body()?.symbols?.keys?.toList();
                withContext(Dispatchers.Main) {
                    if (currenciesSymbols != null) {
                        renderCurrenciesOptions(currenciesSymbols)
                    } else {
                        showToast(
                            "Error loading coins. Please try later.",
                           )
                    }
                }
            } catch (e: HttpException) {
                Log.e("ApiError", "Error in API response", e)
                showToast(
                    "Error communicating with the server. Please try again.",
                    )
            } catch (e: IOException) {
                Log.e("NetworkError", "Connectivity error", e)
                showToast("Connectivity error")
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
                        showToast("Please try again")
                        fetchCurrencies();
                    }
                }
            } catch (e: HttpException) {
                Log.e("ApiError", "Error in API response", e)
                showToast("Error communicating with the server. Please try again")

            } catch (e: IOException) {
                Log.e("NetworkError", "Connectivity error", e)
                showToast("Connectivity error")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }
}