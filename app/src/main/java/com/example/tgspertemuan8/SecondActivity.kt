package com.example.tgspertemuan8

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.tgspertemuan8.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(EXTRA_USERNAME)

        with(binding) {
            binding.usernameHomepage.text = username
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_options, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logoutbtn -> {
                // Berpindah dari SecondActivity ke MainActivity yang berisi FragmentRegister
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("navigate_to_fragment", "register")
                startActivity(intent)
                finish() // Menutup SecondActivity
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}