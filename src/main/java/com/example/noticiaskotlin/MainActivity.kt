package com.example.noticiaskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val noticiaAge = Noticia("C://Users//fmfr//AndroidStudioProjects//NoticiasKotlin//app//src//main//res//drawable//age.jpeg","Age of Empires 4","Lorem ipsomLorem ipsomLoLorem ipsomLorem ipsomLorem ipsomLorem ipsomLorem ipsomLorem ipsomLorem ipsomLorem ipsomLorem ipsomLorem ipsom","20/10/22")
        val noticiaCiv = Noticia("res/drawable/civ.jpeg","civ 6 saiu", "lorem sodaidokasjfkadjdsakUJDAOSDIQWODASKLDMASK","31/08/2022")
        val noticiaDestiny = Noticia("res/drawable/destiny.jpeg","destiny 2: uma bosta", "sadskadjasicmvnxcmnviasod", "31/08/2022")
        val noticiaGow = Noticia("res/drawable/gow.jpeg", "God Of War sai pra ps5", "god of war god of war god of war", "31/08/2022")

        val newsList = listOf(noticiaAge,noticiaCiv,noticiaGow, noticiaDestiny)

        for (i in 1..newsList.size) {
            var texto = newsList[i].titulo
            Toast.makeText(this, texto,Toast.LENGTH_LONG).show()
        }


    }

    class Noticia(img:String, titulo:String, texto:String, data:String){
        var img:String = ""
        var titulo:String = ""
        var texto:String = ""
        var data:String = ""

        init {
            this.img = img
            this.titulo = titulo
            this.texto = texto
            this.data = data
        }
    }
}