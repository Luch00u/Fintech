package repositorios

import entidades.Usuario

class UsuarioRepositorio {
    val usuarios = mutableListOf<Usuario>()

    fun agregar(usuario: Usuario) {
        if(existe(usuario.nickname)){
            //TODO fallar
        }
        usuarios.add(usuario)
    }

    fun eliminar(usuario: Usuario) {
        usuarios.remove(usuario)
    }

    fun existe(nickname: String): Boolean {
        //TODO: Completar
    }

    fun iniciar(nickname: String, password: String): List<Usuario> {
        //TODO: Completar
    }
}