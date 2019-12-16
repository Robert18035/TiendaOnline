package com.example.base1

class Producto {
    private var ImagenURL: String? = null
    private var Nombre: String?= null
    private var Talla: String? = null
    private var Color: String? = null
    private var Categoria: String? = null
    private var Precio: Int? = null

    constructor() {}


    constructor(ImagenURL: String?, Nombre: String?, Talla: String?, Color: String?, Categoria: String?, Precio: Int?) {
        this.ImagenURL = ImagenURL
        this.Nombre = Nombre
        this.Talla = Talla
        this.Color = Color
        this.Categoria = Categoria
        this.Precio = Precio
    }


    fun getImagenURL(): String? {
        return ImagenURL
    }
    fun setImagenURL(ImagenURL: String?) {
        this.ImagenURL = ImagenURL
    }
    fun getNombre(): String? {
        return Nombre
    }
    fun setNombre(Nombre: String?) {
        this.Nombre = Nombre
    }
    fun getTalla(): String? {
        return Talla
    }
    fun setTalla(Talla: String?) {
        this.Talla = Talla
    }
    fun getColor(): String? {
        return Color
    }
    fun setColor (Color: String?) {
        this.Color = Color
    }
    fun getCategoria(): String? {
        return Categoria
    }
    fun setCategoria (Categoria: String?) {
        this.Categoria = Categoria
    }
    fun getPrecio(): Int? {
        return Precio
    }
    fun setPrecio (Precio: Int?) {
        this.Precio = Precio
    }
}
