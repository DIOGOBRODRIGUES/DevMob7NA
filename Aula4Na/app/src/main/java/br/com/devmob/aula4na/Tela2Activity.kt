package br.com.devmob.aula4na

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)

        val cliente = intent.getParcelableExtra<Cliente>("cliente")

        textMensagem.text = if(cliente !=null){
            "Nome: ${cliente.nome} / Código: ${cliente.codigo}"
        }else {
            "Nome: $nome / idade: $idade"
        }
    }
}