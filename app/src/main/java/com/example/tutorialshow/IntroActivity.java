package com.example.tutorialshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("jdhfjdhf", "jdfhjdhfjd", R.drawable.img_1));
        mList.add(new ScreenItem("fgfgfg", "jfg", R.drawable.img_1));
        mList.add(new ScreenItem("fgggf", "jfgggg", R.drawable.img_1));

        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);

    }
}
