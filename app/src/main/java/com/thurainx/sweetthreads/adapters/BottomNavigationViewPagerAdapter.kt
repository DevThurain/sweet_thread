package com.thurainx.sweetthreads.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.thurainx.sweetthreads.fragments.FavouriteFragment
import com.thurainx.sweetthreads.fragments.HomeFragment
import com.thurainx.sweetthreads.fragments.NotificationFragment
import com.thurainx.sweetthreads.fragments.ProfileFragment

class BottomNavigationViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity)  {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
            1 -> FavouriteFragment()
            2 -> NotificationFragment()
            else -> ProfileFragment()
        }
    }
}