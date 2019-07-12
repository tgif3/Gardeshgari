package com.example.gardeshgari.activities;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gardeshgari.HorizontalListView;
import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.AttractionType;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.HorizontalAdapter;
import com.example.gardeshgari.adapter.SliderAdapter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class TourismAttractionActivity extends AppCompatActivity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private ArrayList<String> urls = new ArrayList<>();
    private static LayoutInflater layoutInflater = null;
    private ArrayList<HorizontalListView> horizontalListViews;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_attraction);

        horizontalListViews = new ArrayList<>();
        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        createListView(MainActivity.getDbHelper().getAttractionsByType(AttractionType.natural.toString()), "جاذبه‌های طبیعی");
        createListView(MainActivity.getDbHelper().getAttractionsByType(AttractionType.coast.toString()), "سواحل شمال و جنوب");
        createListView(MainActivity.getDbHelper().getAttractionsByType(AttractionType.health.toString()), "گردشگری و سلامت");
        createListView(MainActivity.getDbHelper().getAttractionsByType(AttractionType.historical.toString()), "تاریخی و فرهنگی");
        createListView(MainActivity.getDbHelper().getAttractionsByType(AttractionType.museum.toString()), "موزه‌ها");
        createListView(MainActivity.getDbHelper().getAttractionsByType(AttractionType.shopping.toString()), "مراکز خرید");
        init();
    }

    private void createListView(ArrayList<AttractionModel> attractionModels, String title) {
        View attractionListView1 = layoutInflater.inflate(R.layout.attraction_list_view, null);
        HorizontalListView horizontalListView = attractionListView1.findViewById(R.id.HorizontalListView);
        horizontalListView.setAdapter(new HorizontalAdapter(this, attractionModels));
        LinearLayout linearLayout = attractionListView1.findViewById(R.id.linearLayout);
        TextView titleTextView = linearLayout.findViewById(R.id.title);
        titleTextView.setText(title);

        linearLayout = findViewById(R.id.mainListView);
        linearLayout.addView(attractionListView1);
        horizontalListViews.add(horizontalListView);
    }

    @Override
    public void onDestroy() {
        for (HorizontalListView horizontalListView : horizontalListViews) {
            horizontalListView.setAdapter(null);
        }
        super.onDestroy();
    }

    private void init() {
        for (int i = 0; i < 10; i++) {
            urls.add("https://cdn.isna.ir/d/2016/10/20/3/57371326.jpg?ts=1498045331768");
        }

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SliderAdapter(this, urls));
        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

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
        }, 0, 3000);
    }
}
