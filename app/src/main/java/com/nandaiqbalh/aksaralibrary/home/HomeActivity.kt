package com.nandaiqbalh.aksaralibrary.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.nandaiqbalh.aksaralibrary.R
import com.nandaiqbalh.aksaralibrary.profile.ProfileActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var btnProfile: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // init
        init()

        // mainButton
        mainButton()
    }

    private fun init(){

        btnProfile = findViewById(R.id.btn_profile)

    }

    private fun mainButton(){

        btnProfile.setOnClickListener {

            val intent = Intent(this@HomeActivity, ProfileActivity::class.java)
            startActivity(intent)

        }

    }
}