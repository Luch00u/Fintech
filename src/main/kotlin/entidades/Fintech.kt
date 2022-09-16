package entidades

import Exceptions.NicknameRepetido
import repositorios.CuentaRepositorio
import repositorios.UsuarioRepositorio
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Fintech(val nombre: String, val cuit: String) {


    //----------- METODOS DE LOGGIN ------------
    fun iniciarSesion(usuarios: UsuarioRepositorio) {

        println("Ingresar usuario")
        var nickname: String = readln();
        println("Ingresar contraseña")
        var password: String = readln();
        usuarios.iniciar(nickname, password);
    }

    fun registrarse(usuarios: UsuarioRepositorio, cuentas: CuentaRepositorio) {
        //variables locales
        var opcion = 0;
        val saldo: Double;
        //-------------
        println("Ingresar nombre");
        val nombre = readln();
        println("Ingresar apellido");
        val apellido = readln();
        println("Ingresar nickname");
        val nickname = readln();
        println("Ingresar contraseña");
        val password = readln();
        println("Desea depositar dinero?\n1)Depositar    2)Omitir y continuar")
        opcion = readln().toInt();
        while (opcion != 2 && opcion != 1) {
            println("Ingrese una opcion correcta\n1)Depositar   2)Omitir y continuar")
            opcion = readln().toInt();
        }
        saldo = if (opcion == 1) {
            println("Ingresar monto a depositar")
            readln().toDouble();
        } else {
            0.00;
        }
        println("Fecha alta");
        val fecha = readln();
        usuarios.agregar(Usuario(nickname, password, nombre, apellido, saldo, fecha));


    }


    //------------- METODOS DE VALIDACION Y OTROS --------------------


}