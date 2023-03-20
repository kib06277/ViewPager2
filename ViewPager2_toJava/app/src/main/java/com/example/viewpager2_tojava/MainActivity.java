package com.example.viewpager2_tojava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private FragmentViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);

        //創建一個adapter
        adapter = new FragmentViewPagerAdapter(this);

        //將 adapter 放入 ViewPager
        viewPager.setAdapter(adapter);

        //指定一開始 ViewPager 顯示內容位置
        viewPager.setCurrentItem(0);
    }
}