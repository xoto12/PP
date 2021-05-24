package com.example.moneyapp

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class SelectAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_account)

        val button = findViewById<Button>(R.id.button2)
        val listView = findViewById<ListView>(R.id.listView)

        val List: ArrayList<String> = ArrayList()

        button.setOnClickListener{
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        List.add("Conta 1")
        List.add("Conta 2")
        List.add("Conta 3")

        val arrayAdapter: ArrayAdapter<*> =
            ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, List as List<Any?>)

        listView.setAdapter(arrayAdapter);
    }
}