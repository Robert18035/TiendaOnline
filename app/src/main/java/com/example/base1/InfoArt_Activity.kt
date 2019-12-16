package com.example.base1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_carrito.*
import kotlinx.android.synthetic.main.activity_infoart.*

class InfoArt_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infoart)
        //codigo para mostrar un artículo en específico (dependiendo de cuál se haya presionado en el TiendaActivity)

        //PARA EL BOTÓN QUE MANDA EL ARTÍCULO AL CARRITO Y OTROS
        //---------------------------------------------------------------------------------------

        agregarCaritoButton.setOnClickListener {
            val intent = Intent(this, CarritoActivity::class.java)
            startActivity(intent)
        }

        //---------------------------------------------------------------------------------------

    }

}

