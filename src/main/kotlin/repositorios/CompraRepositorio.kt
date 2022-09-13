package repositorios

import entidades.Compra

class CompraRepositorio {
    val compra = mutableListOf<Compra>()

    fun agregar(compra: Compra) {
        this.compra.add(compra)
    }

    fun eliminar(compra: Compra) {
        this.compra.remove(compra)
    }

    fun obtenerPorCodigo(codigoCompra:Int){
        //TODO: Completar
    }


    //TODO: elegir los datos para buscar
    fun buscar(): List<Compra> {
        //TODO: Completar
    }
}