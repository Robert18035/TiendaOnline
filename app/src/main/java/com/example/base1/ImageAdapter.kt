package com.example.base1

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView

class ImageAdapter(private val mContext: Context) : BaseAdapter() {

    var thumbImages = arrayOf<Int>(
        R.drawable.tienda,
        R.drawable.categorias,
        R.drawable.carrito,
        R.drawable.acerca
    )

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView = ImageView(mContext)
        imageView.setLayoutParams(AbsListView.LayoutParams(450, 350))
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP)
        imageView.setPadding(8, 8, 8, 8)
        imageView.setImageResource(thumbImages[position])
        return imageView
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return thumbImages.size
    }


}