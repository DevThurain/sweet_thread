package com.thurainx.sweetthreads.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.thurainx.sweetthreads.R
import com.thurainx.sweetthreads.adapters.BottomNavigationViewPagerAdapter
import kotlinx.android.synthetic.main.activity_based.*

class BasedActivity : AppCompatActivity() {
    lateinit var viewPagerAdapter: BottomNavigationViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_based)

        setupViewPager()
        setupListeners()
    }

    private fun setupViewPager() {
        viewPagerAdapter = BottomNavigationViewPagerAdapter(fragmentActivity = this)
        vpContainer.adapter = viewPagerAdapter
    }

    private fun setupListeners() {
        bottomNavigationView.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.navHome -> vpContainer.currentItem = 0
                R.id.navFavourites -> vpContainer.currentItem = 1
                R.id.navNotifications -> vpContainer.currentItem = 2
                R.id.navProfile -> vpContainer.currentItem = 3
            }

            return@setOnItemSelectedListener true
        }

        vpContainer.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                bottomNavigationView.selectedItemId = when (position) {
                    0 -> R.id.navHome
                    1 -> R.id.navFavourites
                    2 -> R.id.navNotifications
                    else -> R.id.navProfile
                }
            }
        })
    }
}