package com.example.gardeshgari;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.adapter.HorizontalAdapter;
import com.example.gardeshgari.adapter.SliderAdapter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class TourismAttractionActivity extends AppCompatActivity {

    private HorizontalListView horizontalListView;
    private HorizontalAdapter horizontalAdapter;
    private ArrayList<AttractionModel> attractionModelArrayList;


    private static ViewPager mPager;
    private static int currentPage = 0;
    private ArrayList<String> urls = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_attraction);

        updateData();

        horizontalListView = findViewById(R.id.HorizontalListView);
        horizontalAdapter = new HorizontalAdapter(this, attractionModelArrayList);
        horizontalListView.setAdapter(horizontalAdapter);

        init();
    }

    @Override
    public void onDestroy() {
        horizontalListView.setAdapter(null);
        super.onDestroy();
    }

    private void updateData() {
        attractionModelArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            attractionModelArrayList.add(new AttractionModel("جنگل سی سنگان نوشهر",
                    "https://www.zistonline.com/uploadFiles/editor/Alangdareh-park.jpg"));
        }
    }

    private void init() {
        for (int i = 0; i < 10; i++) {
            urls.add("https://cdn.isna.ir/d/2016/10/20/3/57371326.jpg?ts=1498045331768");
        }

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SliderAdapter(this, urls));
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == urls.size()) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);
    }
}
