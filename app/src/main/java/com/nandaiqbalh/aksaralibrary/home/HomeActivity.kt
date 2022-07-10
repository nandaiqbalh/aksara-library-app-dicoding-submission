package com.nandaiqbalh.aksaralibrary.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nandaiqbalh.aksaralibrary.R
import com.nandaiqbalh.aksaralibrary.detail.DetailBookActivity
import com.nandaiqbalh.aksaralibrary.helper.BookAdapter
import com.nandaiqbalh.aksaralibrary.model.Book
import com.nandaiqbalh.aksaralibrary.profile.ProfileActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var rvBook: RecyclerView

    private lateinit var toolbar: Toolbar

    private var dataList = ArrayList<Book>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // init
        init()

        // atur data
        aturData()

        // add dummy data
        addDummyBook()

        rvBook.layoutManager = LinearLayoutManager(this)
        rvBook.adapter = BookAdapter(dataList){

            // jika dipencet akan ke halaman detail
            val intent = Intent(this@HomeActivity, DetailBookActivity::class.java).putExtra("data", it)
            startActivity(intent)
        }

        Log.d("Jumlah list: ", "${dataList.size}")
    }

    private fun init(){

        rvBook = findViewById(R.id.rv_book)

        toolbar = findViewById(R.id.toolbar)
    }

    private fun aturData(){

        // set toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Aksara Library"
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.navigationIcon = null
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.profile){
            val intent = Intent(this@HomeActivity, ProfileActivity::class.java)
            startActivity(intent)
        }
        return true
    }

    private fun addDummyBook(){

        dataList.add(Book(
            "Bumi Manusia",
            "Novel Bumi Manusia bercerita tentang perjuangan tokoh Minke memperjuangan kedudukan pribumi melawan diskriminasi Belanda pada masa kolonial Belanda di awal abad keduapuluh. Sebagai anak bupati, Minke bisa bersekolah, dan ia menggunakan pengetahuannya untuk melawan kolonialisme Belanda.",
            "Pramoedya Ananta Toer",
            "Hasta Mitra",
            "Novel, Fiksi Sejarah",
            "Bahasa Indonesia",
            "535",
            R.drawable.buku_bumi_manusia
        ))

        dataList.add(Book(
            "Geez & Ann #1",
            "Berat sekali rasanya harus meninggalkanmu ke Berlin.\n" +
                    "Harus membiarkanmu sendirian dengan banyak pertanyaan. Kamu bisa sabar, kan? Tunggu ya, Geez akan pulang untuk Ann.",
            "Rintik Sedu",
            "Gagas Media",
            "Fiksi, Romance",
            "Bahasa Indonesia",
            "264",
            R.drawable.buku_geez1
        ))

        dataList.add(Book(
            "Segala-galanya Ambyar",
            "Apakah kamu merasa kecewa dengan hidupmu? Apakah kamu merasa cemas secara terus-menerus? Apakah kamu merasa bahwa dunia di sekelilingmu buruk dan jahat?\nYa, dunia ini memang kacau, dunia ini memang ambyar, tapi itu karena Anda tidak sadar bahwa harapan Anda terlalu disilaukan oleh keinginan-keinginan Anda sendiri yang tidak masuk akal.",
            "Mark Mansion",
            "Gramedia Widiasarana Indonesia",
            "Nonfiksi, Self Improvement",
            "Bahasa Indonesia",
            "368",
            R.drawable.buku_segalanya_ambyar
        ))

        dataList.add(Book(
            "Catatan Juang",
            "Catatan Juang adalah buku ketiga karya Fiersa Besari dan merupakan sempalan dari novel sebelumnya yang berjudul Konspirasi Alam Semesta yang dapat kita nikmati secara terpisah. Suar, sang tokoh utama dalam buku ini, adalah seorang karyawan swasta yang melupakan mimpinya hingga menemukan buku sampul merah ini.",
            "Fiersa Besari",
            "MediaKita",
            "Fiksi",
            "Bahasa Indonesia",
            "312",
            R.drawable.buku_catatan_juang
        ))

        dataList.add(Book(
            "Disforsia Inersia",
            "Hidup laksana bianglala, berputar menebar bahagia seakan semua baik-baik saja lalu lupa bahwa poros gerak tetap diam dan tak ke mana-mana",
            "Wira Nagara",
            "MediaKita",
            "Fiksi",
            "Bahasa Indonesia",
            "146",
            R.drawable.buku_disforsia_inersia
        ))

        dataList.add(Book(
            "Distilasi Alkena",
            "Distilasi Alkena adalah sebuah proses memisahkan dua hati yang pada dasarnya tak bisa dipisahkan karena suatu ikatan perasaan. Walaupun dalam perjalanannya, hati akan tumbuh untuk bisa merelakan.",
            "Wira Nagara",
            "MediaKita",
            "Fiksi",
            "Bahasa Indonesia",
            "172",
            R.drawable.buku_distilasi_alkena
        ))

        dataList.add(Book(
            "Garis Waktu",
            "Pada sebuah garis waktu yang merangkak maju, akan ada saatnya kau bertemu dengan satu orang yang mengubah hidupmu untuk selamanya. ",
            "Fiersa Besari",
            "MediaKita",
            "Fiksi",
            "Bahasa Indonesia",
            "216",
            R.drawable.buku_garis_waktu
        ))

        dataList.add(Book(
            "Geez & Ann #2",
            "Sebulan lebih aku sudah berada di Berlin. Mencari, mencari, dan mencari. Sampai akhirnya, aku menemukan sebuah jawaban yang terpaksa aku terima. Bukan jawaban terbaik, tetapi aku harus bisa menghargai itu.",
            "Rintik Sedu",
            "GagasMedia",
            "Fiksi",
            "Bahasa Indonesia",
            "250",
            R.drawable.buku_geez2
        ))

        dataList.add(Book(
            "Geez & Ann #3",
            "Geez kembali dari Berlin dengan kondisi baik dan siap untuk melanjutkan ceritanya dengan Ann. Semua yang Geez kira akan mudah dan indah, ternyata berbeda dengan Ann yang sudah mulai belajar merapikan hidupnya dan memulai cerita baru tanpa Geez sampai ketika Geez kembali hendak menjemput dan membawanya ke Berlin.",
            "Rintik Sedu",
            "GagasMedia",
            "Fiksi",
            "Bahasa Indonesia",
            "224",
            R.drawable.buku_geez3
        ))

        dataList.add(Book(
            "The Kite Runner",
            "The unforgettable, heartbreaking story of the unlikely friendship between a wealthy boy and the son of his father's servant, The Kite Runner is a beautifully crafted novel set in a country that is in the process of being destroyed.",
            "Khaled Hosseini",
            "Riverhead Books",
            "Fiksi, Sejarah",
            "Bahasa Inggris",
            "371",
            R.drawable.buku_thekiterunner
        ))

        dataList.add(Book(
            "Konspirasi Alam Semesta",
            "Seperti apakah warna cinta? Apakah merah muda mewakili rekahannya, ataukah kelabu mewakili pecahannya?",
            "Fiersa Besari",
            "MediaKita",
            "Fiksi",
            "Bahasa Indonesia",
            "244",
            R.drawable.buku_kolase
        ))

        dataList.add(Book(
            "Sebuah Seni untuk Bersikap Bodo Amat",
            "Selama beberapa tahun belakangan, Mark Manson—melalui blognya yang sangat populer—telah membantu mengoreksi harapan-harapan delusional kita, baik mengenai diri kita sendiri maupun dunia. Ia kini menuangkan buah pikirnya yang keren itu di dalam buku hebat ini.",
            "Mark Mansion",
            "Gramedia Widiasarana Indonesia",
            "Nonfiksi, Self Improvement",
            "Bahasa Indonesia",
            "256",
            R.drawable.buku_bodo_amat
        ))


    }
}