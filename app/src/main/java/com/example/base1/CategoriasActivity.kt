package com.example.base1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_categorias.*

class CategoriasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias)
        var adaptador = ImageAdapterCat(this)
        lista_categorias.adapter = adaptador
        lista_categorias.onItemClickListener =
            AdapterView.OnItemClickListener { parent: AdapterView<*>, v: View, position: Int, id: Long ->
                if (position == 0) {
                    val intent = Intent(this, CamisasActivity::class.java) //CamisasActivity
                    startActivity(intent)
                } else if (position == 1) {
                    val intent = Intent(this, PantalonesActivity::class.java) //pantalones
                    startActivity(intent)
                } else {
                    val intent = Intent(this, ChamarrasActivity::class.java) //chamarras
                    startActivity(intent)
                }
            }
    }
}
