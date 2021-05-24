package com.example.moneyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLogin = findViewById<Button>(R.id.button)

        buttonLogin.setOnClickListener{
            val intent= Intent(this, SelectAccount::class.java)
            startActivity(intent)
        }

    }


}
