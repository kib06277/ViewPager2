package com.example.viewpager2_add_tablayout_tokotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2_add_tablayout_tokotlin.FragmentA
import com.example.viewpager2_add_tablayout_tokotlin.FragmentB
import com.example.viewpager2_add_tablayout_tokotlin.FragmentC

class FragmentViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            FragmentA()
        } else if (position == 1) {
            FragmentB()
        } else {
            FragmentC()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}
