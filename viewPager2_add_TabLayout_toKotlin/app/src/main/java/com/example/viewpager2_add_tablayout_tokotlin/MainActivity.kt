package com.example.viewpager2_add_tablayout_tokotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager2
    var adapter: FragmentViewPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewpager)

        //創建一個adapter
        adapter = FragmentViewPagerAdapter(this)

        //將 adapter 放入 ViewPager
        viewPager?.adapter = adapter

        //指定一開始 ViewPager 顯示內容位置
        viewPager?.currentItem = 0

        val title: ArrayList<String> = arrayListOf("今天", "明天", "未來七天")

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = title[position]
        }.attach()
    }
}