import Exceptions.CuentaInexistente
import entidades.Cuenta
import entidades.Usuario
import repositorios.CompraRepositorio
import repositorios.CuentaRepositorio
import repositorios.UsuarioRepositorio
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main() {
    // ---------- INSTANCIA DE OBJETOS Y VARIABLES  -------------------
    val cuentas: CuentaRepositorio = CuentaRepositorio();
    val usuarios: UsuarioRepositorio = UsuarioRepositorio();
    val compras: CompraRepositorio = CompraRepositorio();
    var opcion = 0;
    var nickname: String;
    var password: String;
    var codCuenta: Int;
    var usuarioEncontrado: Usuario = Usuario("null", "null", 0);
    var cuentaEncontrada: Cuenta = Cuenta(1, "null", "null", 0.00, "null");
    var cuentaDatos: String = "";
    val fecha = LocalDate.now();
    val horaActual=LocalTime.now();
    //------------- INICIO DE PROGRAMA -----------------

    do {
        println("  ============        Bienvenido a Orange        ============== ")



        println("Ingrese Usuario")
        nickname = readln();
        println("Ingrese Contraseña")
        password = readln();
        try {
            usuarioEncontrado = usuarios.iniciar(nickname, password);
            codCuenta = usuarioEncontrado.codigoCuenta;
            cuentaEncontrada = cuentas.obtenerPorCodigo(codCuenta);
            println(
                """

Bienvenido/a ${cuentaEncontrada.nombre}                    Fecha: ${fecha}

Seleccionar operacion a realizar: 
1)Datos de cuenta
2)Comprar Bitcoin
3)Historial de compras
4)Consulta de saldo                 
                """.trimMargin()
            )
//----------------------------------- SELECCION DE OPERACION ----------------------------------------------------------
            opcion = readln().toInt();
            when (opcion) {
                1 -> {
                    println(cuentas.obtenerDatosDeCuenta(codCuenta));
                }
                2 -> {
                    println(
                        """
ELEGIR EXCHANGE PARA OPERAR: 1)Criptomas   2)Criptodia   3)Carrecripto                        
                    """.trimIndent()
                    )

                }
            }
        } catch (c: CuentaInexistente) {
            println("Cuenta Inexistente")
            opcion = 2;
        }


        println("Desea continuar?\n1)Continuar   2)Salir")
        opcion = readln().toInt();
    } while (opcion != 2)


}

