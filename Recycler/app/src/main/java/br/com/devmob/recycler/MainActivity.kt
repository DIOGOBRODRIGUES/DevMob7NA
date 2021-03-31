package br.com.devmob.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var messages = mutableListOf<Message>()
    private var adapter = MessageAdapter(messages, this::onMessageItemClick)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        fabAdd.setOnClickListener{
            addMessage()
        }
    }

    private fun initRecyclerView() {
        rvMessages.adapter = adapter
        val layoutManager = GridLayoutManager(this, 2)
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(pos: Int): Int {
                return if (pos == 0) 2 else 1
            }
        }
        rvMessages.layoutManager = layoutManager
        //initSwipeGesture()
    }

    private fun addMessage() {
        val message = Message(
            edtTitle.text.toString(),
            edtText.text.toString()
        )
        messages.add(message)
        adapter.notifyItemInserted(messages.lastIndex)
        edtTitle.text?.clear()
        edtText.text?.clear()
        edtTitle.requestFocus()
    }

    private fun onMessageItemClick(message: Message) {
        val s = "${message.title}\n${message.text}"
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}