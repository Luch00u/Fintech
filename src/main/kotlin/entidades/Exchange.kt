package entidades

abstract class Exchange(var nombre: String, var precio: Double) {

   abstract fun calcularComision(monto:Double):Double



}