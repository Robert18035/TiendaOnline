package com.example.base1

class Producto {
    private var ImagenURL: String? = null
    private var Nombre: String?= null
    private var Talla: String? = null
    private var Color: String? = null

    constructor() {}


    constructor(ImagenURL: String?, Nombre: String?, Talla: String?, Color: String?) {
        this.ImagenURL = ImagenURL
        this.Nombre = Nombre
        this.Talla = Talla
        this.Color = Color
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
}
