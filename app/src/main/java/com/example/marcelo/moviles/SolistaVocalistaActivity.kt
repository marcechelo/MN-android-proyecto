package com.example.marcelo.moviles

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_solista_vocalista.*
import java.text.SimpleDateFormat

class SolistaVocalistaActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solista_vocalista)

        BaseGrupos.datos.add(BandasYGrupos("Black Sabbath","Heaavy Metal","1970-2015","Sony",12,"Inglaterra",arrayOf("ozzy", "geezer","tonny", "bill"),"inactivo"))
        BaseGrupos.datos.add(BandasYGrupos("Metallica","Thrash Metal","1970-actualidad","Blast",18,"EU",arrayOf("Ulrich", "Heatfield","Trujillo", "Hammet"),"Activo"))
        //println(BaseGrupos.recuperarPorIndice(1))
        //println()
        //println(BaseGrupos.recuperarPorIndice(0))

        val sdf = SimpleDateFormat("yyyy/mm/dd")
        val date = sdf.parse("1948/03/09")
        val date2 = sdf.parse("1950/03/09")

        BaseSolistas.datos.add(SolistaOVocalista("Ozzy Osbourne","Heavy Metal","1980-actualidad","Sony",11,"Jonh Michael Osbourne", date,null,"Ingles","voz"))
        BaseSolistas.datos.add(SolistaOVocalista("Bon Jovi","Rock","1985-actualidad","Algo",17,"Jon Bon Jovi", date2,null,"Estado Unidense","voz"))
        //println(BaseSolistas.recuperarPorIndice(1))
        //println()
        //println(BaseSolistas.recuperarPorIndice(0))

        botonGuardarSV.setOnClickListener{ view: View ->
            BaseSolistas.datos.add(SolistaOVocalista(nombreEditText.getText().toString(),
                    generoEditText.getText().toString(),
                    tiempoEditText.getText().toString(),
                    discografiaEditText.getText().toString(),
                    Integer.parseInt(discosEditText.getText().toString()),
                    nombreRealEditText.getText().toString(),
                    sdf.parse(nacimientoEditText.getText().toString()),
                    sdf.parse(muerteEditText.getText().toString()),
                    nacionalidadEditText.getText().toString(),
                    instrumentoeditText.getText().toString()
            )
            )

            Toast.makeText(
                    applicationContext,
                    BaseSolistas.recuperarPorIndice(2),
                    Toast.LENGTH_LONG
            ).show()}

        nombreEditText.setOnClickListener{view: View -> nombreEditText.setText("", TextView.BufferType.NORMAL)}



    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
