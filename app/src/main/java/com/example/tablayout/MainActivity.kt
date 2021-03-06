package com.example.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar.setTitle("Animal")
        setSupportActionBar(toolbar)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager.adapter = fragmentAdapter

        tablayout.setupWithViewPager(viewpager)
    }
}
