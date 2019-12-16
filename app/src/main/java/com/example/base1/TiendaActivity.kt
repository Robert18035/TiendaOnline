package com.example.base1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.firebase.ui.database.FirebaseListAdapter
import com.firebase.ui.database.FirebaseListOptions
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.Query
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_tienda.*
import org.w3c.dom.Text

class TiendaActivity : AppCompatActivity() {
    private var adapter: FirebaseListAdapter<Producto>? = null      //Adaptador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tienda)
        mostrarProductos()
        //---------------------------------------------------------------------------------------
// Este intent es para poder dar click en un elemento del list view, el Toast sólo regresa la posición que se presionó,
        //por lo que sólo falta mandar la info a través de activities
        lista_articulos.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "Artículo: $position", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, InfoArt_Activity::class.java) //cambiar esto Roberto
            intent.putExtra("position", position)
            this.startActivity(intent)
        }
    }
    //---------------------------------------------------------------------------------------
    //MOSTRAR PRODUCTOS EN EL LIST VIEW
    private fun mostrarProductos() {
        val listaArticulos: ListView =
            findViewById(R.id.lista_articulos) as ListView
        val query: Query =
            FirebaseDatabase.getInstance()
                .reference.child("Productos")         //Accesa a la base de datos
        val options: FirebaseListOptions<Producto> =
            FirebaseListOptions.Builder<Producto>()       //Objeto
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
                val Categoria: TextView


                Nombre = v.findViewById<View>(R.id.nombre) as TextView
                producto = v.findViewById<View>(R.id.producto) as ImageView
                Talla = v.findViewById<View>(R.id.talla) as TextView
                Color = v.findViewById<View>(R.id.color) as TextView
                Categoria = v.findViewById<View>(R.id.categoria) as TextView

                Nombre.setText(model.getNombre())
                Picasso.get().load(model.getImagenURL()).into(producto)
                Talla.setText("Talla: " + model.getTalla())
                Color.setText("Color: " + model.getColor())
                Categoria.setText("Categoria: " + model.getCategoria())
            }
        }
        listaArticulos.adapter = adapter
    }
}
