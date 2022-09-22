package entidades

class Criptomas(nombre: String, precio: Double) : Exchange(nombre, precio) {


    override fun calcularComision(monto: Double): Double {
        var total = 0.00;
        total=monto * 1.02
        return total;
    }

}

