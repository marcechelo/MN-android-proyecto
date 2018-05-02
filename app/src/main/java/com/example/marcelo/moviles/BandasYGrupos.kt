package com.example.marcelo.moviles

class BandasYGrupos(nombre: String,
                    genero: String,
                    tiempo: String,
                    compania: String,
                    discos: Int,
                    val nOrigen: String,
                    var nMiembros: Array<String>,
                    val nEstado: String): ArtistaMusical(nombre, genero, tiempo, compania, discos) {

    fun getMiembros(miembros: Array<String>):String{
        var salida=""
        for (posicion in miembros.indices)
            if((posicion+1)==miembros.size){
                salida =salida+miembros.get(posicion)
            }else salida =salida+miembros.get(posicion)+", "
        return salida;
    }

    override fun toString(): String {
        return "Artista: $nNombre" + '\n' +
                "Genero: $nGenero" + '\n' +
                "Tiempo Activo: $nTiempoActividad" + '\n' +
                "Compania Discografica: $nCompaniaDiscografica" + '\n' +
                "Discos: $nDiscos" + '\n' +
                "Origen: $nOrigen" + '\n' +
                "Miembros: ${getMiembros(this.nMiembros)}" + '\n' +
                "Estado: $nEstado"

    }
}
