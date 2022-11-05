package com.thurainx.sweetthreads.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thurainx.sweetthreads.R
import kotlinx.android.synthetic.main.activity_get_started.*
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    companion object{
        fun getIntent(context: Context) : Intent{
            val intent = Intent(context, LoginActivity::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setupListeners()
    }

    private fun setupListeners() {
        btnLoginSignIn.setOnClickListener {
            startActivity(BasedActivity.getIntent(this))
        }
    }
}