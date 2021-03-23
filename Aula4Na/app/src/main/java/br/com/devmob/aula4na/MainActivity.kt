package br.com.devmob.aula4na

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToast.setOnClickListener{
            val texto = editTextTextPersonName.text.toString()
            Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
        }

        buttonTela2.setOnClickListener{
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("nome","Arthur Silva")
            intent.putExtra("idade",50)
            startActivity(intent)
        }

        buttonParcel.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("cliente", Cliente(20, "Mauro Souza"))
            startActivity(intent)
        }

        Log.i("ciclo", "Tela1::onCreat")
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo", "Tela1::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo", "Tela1::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo", "Tela1::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo", "Tela1::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo", "Tela1::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo", "Tela1::onDestroy")
    }
}