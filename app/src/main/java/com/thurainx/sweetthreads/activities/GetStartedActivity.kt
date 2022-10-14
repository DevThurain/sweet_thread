package com.thurainx.sweetthreads.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thurainx.sweetthreads.R
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        setupListeners()
    }

    private fun setupListeners() {
        btnGetStarted.setOnClickListener {
            startActivity(LoginActivity.getIntent(this))
        }
    }
}