package br.com.devmob.aula4naorientacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var names = arrayListOf<String>()
    var adapter : ArrayAdapter<String> ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState !=null){
            names = savedInstanceState.getStringArrayList("name_list")?: arrayListOf()
        }
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        lstNames.adapter = adapter
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putStringArrayList("name_list", names)
    }
    fun btnAddClick (view : View){
        names.add(edtName.text.toString())
        edtName.text.clear()
        adapter?.notifyDataSetChanged()
    }
}