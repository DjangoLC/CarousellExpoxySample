package com.djangomx.carousellepoxoxysample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Filter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.row_carousell.*
import kotlinx.android.synthetic.main.row_carousell.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,
            arrayOf(
                "Hello",
                "world",
                "!"
            ))
        include_spinner.spinner.setAdapter(adapter)
    }
}
