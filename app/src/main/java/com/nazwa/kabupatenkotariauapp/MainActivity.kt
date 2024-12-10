package com.nazwa.kabupatenkotariauapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.Menu
import android.view.MenuItem
import com.nazwa.kabupatenkotariauapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var title: String = "Mode List View"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setActionBarTitle(title)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
private fun setMode(selectedMode: Int) {
    when (selectedMode) {
        R.id.action_list -> {
            title = "Mode List View"
        }
        R.id.action_grid -> {
            title = "Mode Grid View"
        }
        R.id.action_cardview -> {
            title = "Mode Card View"
        }
    }
    setActionBarTitle(title)
}
private fun setActionBarTitle(title: String) {
    supportActionBar?.title = title
}
}