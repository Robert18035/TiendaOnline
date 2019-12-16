package com.example.base1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.firebase.ui.database.FirebaseListAdapter
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_carrito.*
import kotlinx.android.synthetic.main.activity_infoart.*
import kotlinx.android.synthetic.main.activity_main.*

class InfoArt_Activity : AppCompatActivity() {

    private val rootRef = FirebaseDatabase.getInstance().getReference("Productos")
    protected val nom = intent.getStringExtra("nombre")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infoart)
        agregarCarritoButton.setOnClickListener {

            val cantidad = cantidad.text
            val intent = Intent(this, CarritoActivity::class.java)
            startActivity(intent)
        }


    }

}





