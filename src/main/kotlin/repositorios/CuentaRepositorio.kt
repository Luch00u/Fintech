package repositorios

import entidades.Cuenta

class CuentaRepositorio {
    val cuentas = mutableListOf<Cuenta>()

    fun agregar(cuenta: Cuenta) {
        cuentas.add(cuenta)
    }

    fun eliminar(cuenta: Cuenta) {
        cuentas.remove(cuenta)
    }

    fun obtenerPorCodigo(codigoCuenta:Int){
        //TODO: Completar
    }


    fun buscar(nombre: String, apellido: String): List<Cuenta> {
        //TODO: Completar
    }
}