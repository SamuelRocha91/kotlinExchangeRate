package com.betrybe.currencyview.ui.adapters

import android.icu.text.DecimalFormat
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.betrybe.currencyview.data.models.CurrencyRateResponse
import com.betrye.currencyview.R

class RateAdapter(val rates: CurrencyRateResponse): Adapter<RateAdapter.RateViewHolder>() {

    class RateViewHolder(view: View) : ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title_rate_currency)
        val value: TextView = view.findViewById(R.id.content_rate_value)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RateViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rate_conversion_currency, parent, false)
        return RateViewHolder(view)
    }

    override fun getItemCount(): Int {
        return rates.rates.keys.toList().size
    }

    override fun onBindViewHolder(holder: RateViewHolder, position: Int) {
        val keysRates = rates.rates.keys.toList();
        val valuesRates = rates.rates.values.toList()
        Log.d("onBindViewHolder", "Position: $position")
        Log.d("onBindViewHolder", "Keys: $keysRates")
        Log.d("onBindViewHolder", "Values: $valuesRates")

        // Verifique se o valor da posição está correto
        Log.d("onBindViewHolder", "Current Key: ${keysRates[position]}")
        Log.d("onBindViewHolder", "Current Value: ${valuesRates[position]}")

        holder.title.text = keysRates[position];
        holder.value.text = DecimalFormat("0.00").format(valuesRates[position]);
    }
}