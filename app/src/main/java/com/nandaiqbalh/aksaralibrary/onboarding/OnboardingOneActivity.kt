package com.nandaiqbalh.aksaralibrary.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.nandaiqbalh.aksaralibrary.R
import com.nandaiqbalh.aksaralibrary.helper.SharedPrefs
import com.nandaiqbalh.aksaralibrary.home.HomeActivity

class OnboardingOneActivity : AppCompatActivity() {

    private lateinit var btnNext: Button
    private lateinit var btnSkip: Button

    private lateinit var sharedPrefs: SharedPrefs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)

        // variables init
        init()

        // btn triggered
        mainButton()

        if (sharedPrefs.getValue("onboarding").equals("1")){
            val intent = Intent(this@OnboardingOneActivity, HomeActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }
    }

    private fun init(){
        btnNext = findViewById(R.id.btn_next)
        btnSkip = findViewById(R.id.btn_skip)

        sharedPrefs = SharedPrefs(this)
    }

    private fun mainButton(){

        // next
        btnNext.setOnClickListener {
            val intent = Intent(this@OnboardingOneActivity, OnboardingTwoActivity::class.java)
            startActivity(intent)
        }

        btnSkip.setOnClickListener {

            sharedPrefs.setValue("onboarding", "1")

            val intent = Intent(this@OnboardingOneActivity, HomeActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }

    }
}