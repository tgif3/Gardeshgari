package com.example.gardeshgari;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.PictureModel;
import com.example.gardeshgari.adapter.SliderAdapter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class AttractionActivity extends AppCompatActivity {

    private ArrayList<String> urls;
    private static ViewPager mPager;
    private static int currentPage = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);


        TextView name = findViewById(R.id.name);
        TextView address = findViewById(R.id.address);
        TextView description = findViewById(R.id.description);

        AttractionModel attractionModel = MainActivity.getDbHelper().getAllAttractions().get(0);

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
