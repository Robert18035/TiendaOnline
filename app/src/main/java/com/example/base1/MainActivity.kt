package com.example.base1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adaptador = ImageAdapter(this)
        gridView1.adapter = adaptador
        gridView1.onItemClickListener =
            AdapterView.OnItemClickListener { parent: AdapterView<*>, v: View, position: Int, id: Long ->

                if (position == 0) {
                    val intent = Intent(this, TiendaActivity::class.java)
                    startActivity(intent)
                } else if(position == 1){
                    val intent = Intent(this, CategoriasActivity::class.java)
                    startActivity(intent)
                } else if(position == 2){
                    val intent = Intent(this, CarritoActivity::class.java)
                    startActivity(intent)
                } else{
                    val intent = Intent(this, AboutActivity::class.java)
                    startActivity(intent)
                }
            }
    }
}
