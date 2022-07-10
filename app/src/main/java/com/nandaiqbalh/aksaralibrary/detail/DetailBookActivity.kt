package com.nandaiqbalh.aksaralibrary.detail

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.nandaiqbalh.aksaralibrary.R
import com.nandaiqbalh.aksaralibrary.model.Book

class DetailBookActivity : AppCompatActivity() {

    private lateinit var ivGambarBukuDetail: ImageView

    private lateinit var tvTitleDetail: TextView
    private lateinit var tvDesc: TextView
    private lateinit var tvAuthor: TextView
    private lateinit var tvPublisher: TextView
    private lateinit var tvCategory: TextView
    private lateinit var tvLanguage: TextView
    private lateinit var tvPages: TextView

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_book_scroll)

        // ambil data
        val data = intent.getParcelableExtra<Book>("data")

        // init
        init()

        if (data != null){
            // atur data
            aturData(data)

        }

    }

    private fun init(){

        ivGambarBukuDetail = findViewById(R.id.iv_gambar_detail_buku)

        tvTitleDetail = findViewById(R.id.tv_title_detail)
        tvDesc = findViewById(R.id.tv_desc)
        tvAuthor = findViewById(R.id.tv_value_author)
        tvPublisher = findViewById(R.id.tv_value_publisher)
        tvCategory = findViewById(R.id.tv_value_category)
        tvLanguage = findViewById(R.id.tv_value_language)
        tvPages = findViewById(R.id.tv_value_pages)

        toolbar = findViewById(R.id.toolbar)
    }

    private fun aturData(data: Book?){

        ivGambarBukuDetail.setImageResource(data?.poster!!)

        tvTitleDetail.text = data?.title
        tvDesc.text = data?.desc
        tvAuthor.text = data?.author
        tvPublisher.text = data?.publisher
        tvCategory.text = data?.category
        tvLanguage.text = data?.language
        tvPages.text = data?.pages

        // set toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title = data?.title
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationIcon(R.drawable.ic_back)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}