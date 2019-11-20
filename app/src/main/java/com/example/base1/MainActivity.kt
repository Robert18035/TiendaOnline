package com.example.base1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adaptador = ImageAdapter(this)
        gridView1.adapter = adaptador
        gridView1.onItemClickListener =
            AdapterView.OnItemClickListener { parent: AdapterView<*>, v: View, position: Int, id: Long ->
                Toast.makeText(
                    this,
                    "Posicion de la Imagen: $position",
                    Toast.LENGTH_SHORT
                ).show()
            }
    }
}
