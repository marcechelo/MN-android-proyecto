package com.example.marcelo.moviles

class BaseSolistas{
    companion object {
        val datos: ArrayList<SolistaOVocalista> = ArrayList()

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