package com.nandaiqbalh.aksaralibrary.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import com.nandaiqbalh.aksaralibrary.R
import com.nandaiqbalh.aksaralibrary.model.Book

class DetailBookActivity : AppCompatActivity() {

    private lateinit var tvTitleDetail: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_book)

        // ambil data
        val data = intent.getParcelableExtra<Book>("data")

        // init
        init()

        // atur data
        aturData(data)

    }

    private fun init(){
        tvTitleDetail = findViewById(R.id.tv_title_detail)
    }

    private fun aturData(data: Book?){

        tvTitleDetail.text = data?.title

    }
}