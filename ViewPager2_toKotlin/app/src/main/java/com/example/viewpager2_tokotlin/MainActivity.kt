package com.example.viewpager2_tokotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private var viewPager: ViewPager2? = null
    private var adapter: FragmentViewPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewpager)

        //創建一個adapter
        adapter = FragmentViewPagerAdapter(this)

        //將 adapter 放入 ViewPager
        viewPager?.adapter = adapter

        //指定一開始 ViewPager 顯示內容位置
        viewPager?.currentItem = 0
    }
}