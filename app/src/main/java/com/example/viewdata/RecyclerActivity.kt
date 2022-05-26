package com.example.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : AppCompatActivity() {

    //deklarasi
    var dataBuah = arrayOf("alpukat","durian","jambuair","manggis","strawberry")
    var dataGambar= arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawbery)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        //custom adapter, nanti dibuatkan constructor nnti akan di buat contrut di custom adapter
    var adapter = CustomAdapter(this, dataBuah, dataGambar)
    //buat layout manaager
    var liner = LinearLayoutManager(applicationContext)
    //manggil listnya
     recylerview.adapter = adapter
        recylerview.layoutManager = liner
    }
}

