package SRP.Con

import SRP.Sin.Producto

class producto(val nombre: String, val precio: Double) {
}

class calcularDescuento{
    fun aplicardescuento(producto: Producto, porcentaje: Double): Double {
        return producto.precio - (producto.precio * porcentaje / 100)
    }
}

class imprimirdetalles{
    fun imprimir(producto: Producto) {
        println("Producto: ${producto.nombre}, Precio: ${producto.precio}")
    }
}

fun main() {
    val Producto = Producto("Laptop", 1500.0)
    val Descuento = calcularDescuento()
    val imprimir = imprimirdetalles()

    println("Precio con descuento ${Descuento.aplicardescuento(Producto, 10.0)}")
    imprimir.imprimir(Producto)

}