package repositorios

import entidades.Cuenta

class CuentaRepositorio {
    val cuentas = mutableListOf<Cuenta>()
    init {
        val cuenta1:Cuenta=Cuenta(1,"Luciano","Jaime",60000.00,"2022-06-05");
        val cuenta2:Cuenta=Cuenta(2,"Maria","Iglesias",50000.00,"2021-06-15");
        val cuenta3:Cuenta=Cuenta(3,"Ezequiel","Torres",80000.00,"2022-09-18");
        cuentas.add(cuenta1)
        cuentas.add(cuenta2)
        cuentas.add(cuenta3)
    }

    fun agregar(cuenta: Cuenta) {
        cuentas.add(cuenta)
    }

    fun eliminar(cuenta: Cuenta) {
        cuentas.remove(cuenta)
    }

    fun obtenerPorCodigo(codigoCuenta:Int){
        //TODO: Completar
    }


   /* fun buscar(nombre: String, apellido: String): List<Cuenta> {
        //TODO: Completar
    }*/
}