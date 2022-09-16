package repositorios

import Exceptions.NicknameRepetido
import entidades.Usuario

class UsuarioRepositorio {
    val usuarios = mutableListOf<Usuario>()

    fun agregar(usuario: Usuario) {
        if (existe(usuario.nickname)) {
            try {
                usuarios.add(usuario);
            } catch (e: NicknameRepetido) {
                println("El nombre de usuario ya existe")
            } finally {
                "Por favor vuelva a ingresar un usuario valido"
            }
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
    fun iniciar(nickname: String, password: String): Usuario {
        var encontrado: Usuario? = null;
        for (u in usuarios) {
            if (u.nickname == nickname && u.password == password) {
                encontrado = u;
            }
        }
        return encontrado!!;
    }


}