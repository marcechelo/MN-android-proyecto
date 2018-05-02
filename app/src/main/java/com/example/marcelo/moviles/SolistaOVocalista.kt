package com.example.marcelo.moviles

import java.time.LocalDate
import java.util.*

class SolistaOVocalista (nombre: String,
                         genero: String,
                         tiempo: String,
                         compania: String,
                         discos: Int,
                         val nNombreReal: String,
                         val nFechaNacimiento: Date,
                         val nMuerte: Date?,
                         val nNacionalidad: String,
                         val nInstrumento: String) : ArtistaMusical(nombre, genero, tiempo, compania, discos) {

    override fun toString(): String {
        return "Artista: $nNombre" + '\n' +
                "Genero: $nGenero" + '\n' +
                "Tiempo Activo: $nTiempoActividad" + '\n' +
                "Compania Discografica: $nCompaniaDiscografica" + '\n' +
                "Discos: $nDiscos" + '\n' +
                "Nombre Real: $nNombreReal" + '\n' +
                "Fecha de Nacimiento: $nFechaNacimiento" + '\n' +
                "Fecha de Muerte: $nMuerte" + '\n' +
                "Nacionalidad: $nNacionalidad" + '\n' +
                "Instrumentos: $nInstrumento"

    }
}