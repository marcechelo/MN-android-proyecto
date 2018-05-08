package com.example.marcelo.moviles

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.content_main.*

class Main : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonSolistaVocalist.setOnClickListener{view: View ->irAActividadSolistaOVocalista()}

    }

    fun irAActividadSolistaOVocalista(){
        val intent = Intent(this,SolistaVocalistaActivity::class.java)
        startActivity(intent)
    }
}