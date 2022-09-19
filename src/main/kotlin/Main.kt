import entidades.Usuario
import repositorios.CompraRepositorio
import repositorios.CuentaRepositorio
import repositorios.UsuarioRepositorio
import java.time.LocalDate
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
    //------------- INICIO DE PROGRAMA -----------------

    do {
        println("  ============        Bienvenido a Orange        ============== ")


        while (opcion != 1 && opcion != 2) {
            println("Iniciar Sesionm\nIngrese Usuario")
            nickname = readln();
            println("Ingrese Contraseña")
            password = readln();
            val encontrado: Usuario? = usuarios.iniciar(nickname, password);
            if (encontrado != null) {
                codCuenta = encontrado.codigoCuenta;
                cuentas.obtenerPorCodigo(codCuenta);
            } else {
                opcion = 2;
            }
        }
    } while (opcion != 2)


}

