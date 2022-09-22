package repositorios

import Exceptions.CuentaInexistente
import entidades.Cuenta
import entidades.Usuario

class CuentaRepositorio {
    val cuentas = mutableListOf<Cuenta>()

    init {
        val cuenta1: Cuenta = Cuenta(1, "Luciano", "Jaime", 60000.00, "2022-06-05");
        val cuenta2: Cuenta = Cuenta(2, "Maria", "Iglesias", 50000.00, "2021-06-15");
        val cuenta3: Cuenta = Cuenta(3, "Ezequiel", "Torres", 80000.00, "2022-09-18");
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

    fun obtenerDatosDeCuenta(codigoCuenta: Int): String {
        var encontrada: Cuenta = Cuenta(0, "null", "null", 00.00, "null");
        for (cuenta in cuentas) {
            if (cuenta.codigoCuenta == codigoCuenta) {
                encontrada = cuenta;
                break;
            }
        }

        return """
            Código de cuenta:${encontrada.codigoCuenta}
            Nombre y apellido: ${encontrada.nombre} ${encontrada.apellido}
            Saldo disponible:${encontrada.dineroEnCuenta}
            Fecha de alta:${encontrada.fechaAlta}
            """.trimIndent();
    }

    fun obtenerPorCodigo(codigoCuenta: Int): Cuenta {
        var encontrada: Cuenta = Cuenta(0, "null", "null", 00.00, "null");
        for (cuenta in cuentas) {
            if (cuenta.codigoCuenta == codigoCuenta) {
                encontrada = cuenta;
                break;
            }
        }
        return encontrada
    }


    /* fun buscar(nombre: String, apellido: String): List<Cuenta> {
         //TODO: Completar
     }*/
}