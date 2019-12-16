package com.example.base1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_carrito.*

class CarritoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        enviar.setOnClickListener {
            val toNumber = "5214951010622"
            val text = "helloo desde App tienda online para contacto personalizado"
            val sIntent = Intent(Intent.ACTION_VIEW)
            sIntent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + toNumber + "&text=" + text))
            sIntent.setPackage("com.whatsapp")
            startActivity(sIntent)
        }
    }
}
