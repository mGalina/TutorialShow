package com.example.tutorialshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabIndicator;
    Button btnNext;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_intro);

        getSupportActionBar().hide();

        btnNext = findViewById(R.id.btn_next);
        tabIndicator = findViewById(R.id.tab_indicator);

        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("МОНИТОРИНГ", "Контроль местоположения в режиме реального времени", R.drawable.img_1));
        mList.add(new ScreenItem("ЗАПРОС ТРЕКА", "Просмотр истории перемещения за выбранный интервал времени", R.drawable.img_1));
        mList.add(new ScreenItem("ТЕЛЕМЕТРИЯ", "Графический анализ динамики поведения параметров автомобиля", R.drawable.img_1));
//        mList.add(new ScreenItem("ОТЧЕТЫ", "Гибкая система отчётов, контроль расхода топлива, контроль параметров CAN шины", R.drawable.img_1));
//        mList.add(new ScreenItem("КОНТРОЛЬ КАЧЕСТВА", "Система контроля качества эксплуатации и вождения", R.drawable.img_1));
//        mList.add(new ScreenItem("ПРОСМОТР СОБЫТИЙ", "Параметрическая система событий", R.drawable.img_1));

        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);

        tabIndicator.setupWithViewPager(screenPager);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if(position < mList.size()) {

                    position ++;
                    screenPager.setCurrentItem(position);
                }

                if(position == mList.size()) {


                }
            }
        });

    }
}
