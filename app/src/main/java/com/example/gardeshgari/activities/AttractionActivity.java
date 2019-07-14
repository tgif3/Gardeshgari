package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.PictureModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.SliderAdapter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class AttractionActivity extends AppCompatActivity {

    private ArrayList<String> urls;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static AttractionModel attractionModel;
    private static boolean callByHome;
    private android.support.v7.widget.Toolbar toolbar;

    public static void setAttractionModel(AttractionModel attractionModel) {
        AttractionActivity.attractionModel = attractionModel;
    }

    public static void setCallByHome(boolean callByHome) {
        AttractionActivity.callByHome = callByHome;
    }

    @SuppressLint("CutPasteId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView name = findViewById(R.id.name);
        TextView address = findViewById(R.id.address);
        TextView description = findViewById(R.id.description);

        name.setText(attractionModel.getTitle());
        address.setText(attractionModel.getAddress());
        description.setText(attractionModel.getDescription());
        init(attractionModel.getId());
    }

    private void init(String attractionId) {
        ArrayList<PictureModel> pictureModels = MainActivity.getDbHelper().getAllPicturesByAttractionId(attractionId);
        urls = new ArrayList<>();
        for (PictureModel pictureModel : pictureModels) {
            urls.add(pictureModel.getImageUrl());
        }
        urls.add(attractionModel.getImageUrl());

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (callByHome) {
            getMenuInflater().inflate(R.menu.home_menu, menu);
        } else {
            getMenuInflater().inflate(R.menu.province_menu, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.province) {
            Intent intent = new Intent(this, ProvinceActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.home) {
            Intent intent = new Intent(this, TourismAttractionActivity.class);
            startActivity(intent);
        }
        return false;
    }
}
