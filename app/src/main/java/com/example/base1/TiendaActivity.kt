package com.example.base1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.firebase.ui.database.FirebaseListAdapter
import com.firebase.ui.database.FirebaseListOptions
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.Query
import com.squareup.picasso.Picasso

class TiendaActivity : AppCompatActivity() {
    private var adapter: FirebaseListAdapter<Producto>? = null      //Adaptador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tienda_activity)
        mostrarProductos()
    }

    private fun mostrarProductos() {
        val listaArticulos: ListView =
            findViewById(R.id.lista_articulos) as ListView
        val query: Query =
            FirebaseDatabase.getInstance().reference.child("Productos")         //Accesa a la base de datos
        val options: FirebaseListOptions<Producto> = FirebaseListOptions.Builder<Producto>()       //Objeto
            .setLayout(R.layout.item_lista)
            .setQuery(query, Producto::class.java)
            .setLifecycleOwner(this)
            .build();
        adapter = object : FirebaseListAdapter<Producto>(options) {
            override fun populateView(
                v: View,
                model: Producto,
                position: Int
            ) { //obtiene las referencia a los TextView del item_lista.xml

                val producto: ImageView
                val Nombre: TextView
                val Talla: TextView
                val Color: TextView


                Nombre = v.findViewById<View>(R.id.nombre) as TextView
                producto = v.findViewById<View>(R.id.producto) as ImageView
                Talla = v.findViewById<View>(R.id.talla) as TextView
                Color = v.findViewById<View>(R.id.color) as TextView

                Nombre.setText(model.getNombre())
                Picasso.get().load(model.getImagenURL()).into(producto)
                Talla.setText(model.getTalla())
                Color.setText(model.getColor())
            }
        }
        listaArticulos.adapter = adapter
    }
}
