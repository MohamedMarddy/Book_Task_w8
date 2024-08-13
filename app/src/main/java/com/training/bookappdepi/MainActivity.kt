package com.training.bookappdepi

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.training.bookappdepi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val books = mutableListOf<Book>(
            Book("Dan Brown", "by Dan Brown", R.drawable.angels, 3.0),
            Book("Blood Line"," by James", R.drawable.blood, 3.0),
            Book("TERRA NOSTRA", " by Test", R.drawable.nostra, 2.6),
            Book("book1", "by tes1", R.drawable.humming, 2.1),
            Book("book2", "by tes2", R.drawable.sword, 4.0),
            Book("book3", "by tes3", R.drawable.spirits, 5.0),
            Book("book4", "by tes4", R.drawable.solitude, 1.5),
            Book("book5", "by tes5", R.drawable.sword, 4.0),
            Book("book6", "by Ahmed", R.drawable.spirits, 5.0),
            Book("book7", "by mahmoud", R.drawable.solitude, 1.5),
        )

binding.toolbar.materialToolbar.setNavigationOnClickListener {
binding.drawerLayout.open()
}
        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.review -> {
                    Toast.makeText(this, R.string.reviewsClick, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.fav -> {
                    Toast.makeText(this, R.string.favClick, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.search -> {
                    Toast.makeText(this, R.string.searchClick, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.profile -> {
                    Toast.makeText(this, R.string.profileClick, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.settings -> {
                    Toast.makeText(this, R.string.settings_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                else -> false
            }
        }
        val bookAdapter = BookAdapter(books)
        binding.rvBooks.layoutManager = LinearLayoutManager(this)
        binding.rvBooks.adapter = bookAdapter

        binding.toolbar.materialToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.notification -> {
                    Toast.makeText(this, "Notification is clicked", Toast.LENGTH_SHORT).show()
                    true
                }


                else ->
                    false

            }
        }
    }
}