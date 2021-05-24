package com.example.moneyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val homeFragment = HomeFragment()
    val personFragment = PersonFragment()
    val creditCardFragment = CreditCardFragment()
    val settingsFragment = SettingsFragment()
    val walletFragment = WalletFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(homeFragment)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_home -> replaceFragment(homeFragment)
                R.id.ic_person -> replaceFragment(personFragment)
                R.id.ic_credit_card -> replaceFragment(creditCardFragment)
                R.id.ic_settings -> replaceFragment(settingsFragment)
                R.id.ic_wallet -> replaceFragment(walletFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}