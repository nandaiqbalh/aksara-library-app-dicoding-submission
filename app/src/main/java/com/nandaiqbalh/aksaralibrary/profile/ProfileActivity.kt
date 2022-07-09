package com.nandaiqbalh.aksaralibrary.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.nandaiqbalh.aksaralibrary.R
import com.nandaiqbalh.aksaralibrary.home.HomeActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var btnBack: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // init
        init()

        // main button
        mainButton()

    }

    private fun init(){

        btnBack = findViewById(R.id.btn_back)

    }

    private fun mainButton(){

        btnBack.setOnClickListener {

            val intent = Intent(this@ProfileActivity, HomeActivity::class.java)
            startActivity(intent)
            finishAffinity()

        }
    }
}