package repositorios

import Exceptions.NicknameRepetido
import entidades.Usuario

class UsuarioRepositorio {
    val usuarios = mutableListOf<Usuario>()

    init {
        val usuario1: Usuario = Usuario("Luch0u", "lucho12345", 1);
        val usuario2: Usuario = Usuario("Rodri", "soyeldody", 2);
        val usuario3: Usuario = Usuario("Crusher", "12345678910once", 3);

        usuarios.add(usuario1)
        usuarios.add(usuario2)
        usuarios.add(usuario3)

    }

    fun agregar(usuario: Usuario) {
        try {
            if (!existe(usuario.nickname)) {
                usuarios.add(usuario);
            }
        } catch (e: NicknameRepetido) {
            println("Nickname repetido");
        }

    }

    fun eliminar(usuario: Usuario) {
        usuarios.remove(usuario)
    }

    fun existe(nickname: String): Boolean {
        for (u in usuarios) {
            if (u.nickname == nickname) {
                throw NicknameRepetido();
            }
        }
        return true;
    }

    /*fun iniciar(nickname: String, password: String): List<Usuario> {
        val listaUsuario: MutableList<Usuario> = mutableListOf();
        return listaUsuario;
    }*/

    fun iniciar(nickname: String, password: String): Usuario? {
        var encontrado: Usuario? = null;
        for (u in usuarios) {
            if (u.nickname == nickname && u.password == password) {
                encontrado = u;
                println("Existe");
                break;
            } else {
                println("No existe");
                break;
            }
        }
        return encontrado;
    }


}