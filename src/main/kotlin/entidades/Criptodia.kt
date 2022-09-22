package entidades

import java.time.LocalTime

class Criptodia(nombre: String, precio: Double, var hora: LocalTime) : Exchange(nombre, precio) {


    override fun calcularComision(monto: Double): Double {
        val hora1 = LocalTime.of(20, 0)
        val hora2 = LocalTime.of(23, 59)
        if (hora in hora1..hora2) {
            return monto * 1.01
        }
        return monto * 1.03

    }


}

fun main(){
    val cripto:Criptodia=Criptodia("hola",50.00, LocalTime.now())

   println( cripto.calcularComision(100.00))
}
