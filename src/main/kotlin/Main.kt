import entidades.Fintech
import repositorios.CompraRepositorio
import repositorios.CuentaRepositorio
import repositorios.UsuarioRepositorio
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    val orange: Fintech = Fintech("orange", "238775499");
    val cuentas: CuentaRepositorio = CuentaRepositorio();
    val usuarios: UsuarioRepositorio = UsuarioRepositorio();
    val compras: CompraRepositorio = CompraRepositorio();

    var opcion = 0;
    //------------- INICIO DE PROGRAMA -----------------
    do {
        println("Bienvenido a Orange\n1)Registrarse\n2)Iniciar Sesión")
        opcion = readln().toInt();
        when (opcion) {
            1 -> orange.registrarse(usuarios,cuentas);
            2 -> orange.iniciarSesion(usuarios);
        }




        println("Desea continuar?\n1)Continuar   2)Salir");
        opcion = readln().toInt();
        while (opcion != 1 && opcion != 2) {
            println("Por favor ingrese una opcion correcta\n1)Continuar   2)Salir");
            opcion = readln().toInt();
        }
    } while (opcion != 2)


}

