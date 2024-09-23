package com.betrybe.currencyview.ui.views.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.betrybe.currencyview.common.ApiIdlingResource
import com.betrybe.currencyview.data.api.ApiLayer
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

    val loadingCurrency: MaterialTextView by lazy { findViewById(R.id.load_currency_state) }
    val selectOptions: AutoCompleteTextView by lazy { findViewById(R.id.currency_selection_input_layout) }
    val selectCurrency: MaterialTextView by lazy { findViewById(R.id.select_currency_state) }
    private val apiService = ApiLayer.instance;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchCurrency()
    }

    private fun searchCurrency() {
        loadingCurrency.visibility = View.VISIBLE;

        CoroutineScope(Dispatchers.IO).launch {
            try {
                ApiIdlingResource.increment()

                val currencies = apiService.getSymbols(apiKey).body()?.symbols?.keys?.toList();

                withContext(Dispatchers.Main) {
                    currencies?.let {
                        loadingCurrency.visibility = View.GONE;
                        selectCurrency.visibility = View.VISIBLE;
                        val adapter = ArrayAdapter(baseContext, android.R.layout.simple_dropdown_item_1line, currencies)
                        selectOptions.setAdapter(adapter)
                    } ?: kotlin.run {
                        Toast.makeText(baseContext, "Deu ruim", Toast.LENGTH_LONG).show()
                    }
                }
                ApiIdlingResource.decrement()
            } catch (e: HttpException) {
                ApiIdlingResource.decrement()

            } catch (e: IOException) {
                // ADICIONAR ESSA LINHA
                ApiIdlingResource.decrement()
            }
        }
    }
}
