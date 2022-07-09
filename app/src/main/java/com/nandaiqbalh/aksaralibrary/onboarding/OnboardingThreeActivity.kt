package com.nandaiqbalh.aksaralibrary.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.nandaiqbalh.aksaralibrary.R
import com.nandaiqbalh.aksaralibrary.helper.SharedPrefs
import com.nandaiqbalh.aksaralibrary.home.HomeActivity

class OnboardingThreeActivity : AppCompatActivity() {

    private lateinit var btnGetStarted: Button

    private lateinit var sharedPrefs: SharedPrefs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_three)

        // init
        init()

        // main button
        mainButton()

    }

    private fun init(){

        btnGetStarted = findViewById(R.id.btn_get_started)

        sharedPrefs = SharedPrefs(this)
    }

    private fun mainButton(){

        btnGetStarted.setOnClickListener {

            sharedPrefs.setValue("onboarding", "1")

            val intent = Intent(this@OnboardingThreeActivity, HomeActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }

    }
}