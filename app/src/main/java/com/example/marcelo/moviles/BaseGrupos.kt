package com.example.marcelo.moviles

class BaseGrupos{
    companion object {
        val datos: ArrayList<BandasYGrupos> = ArrayList()

        fun recuperarPorIndice(indice:Int): String? {
            for (indiceArreglo in datos.indices){
                if(indiceArreglo == indice){
                    return datos[indiceArreglo].toString()
                }
            }
            return null
        }
    }
}