package com.example.moneyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Response
import okhttp3.ResponseBody
import kotlin.math.round

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



    fun getDados() {
     Api.retrofitService.getProperties().enqueue(
           object : retrofit2.Callback<UserBody>{
               override fun onFailure(call: retrofit2.Call<UserBody>, t: Throwable) {

               }

               override fun onResponse(
                   call: retrofit2.Call<UserBody>,
                   response: retrofit2.Response<UserBody>
               ) {

               }

           }
        )
    }



}
