package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gardeshgari.data.DataClass;
import com.example.gardeshgari.model.PictureModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.SliderAdapter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

@SuppressLint("StaticFieldLeak")

public class AttractionActivity extends AppCompatActivity {
    private ArrayList<String> urls;
    private ViewPager mPager;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @SuppressLint("CutPasteId")
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);

        initializeUi();
    }

    private void initializeUi() {
        TextView name = findViewById(R.id.name);
        TextView address = findViewById(R.id.address);
        TextView description = findViewById(R.id.description);

        name.setText(DataClass.getInstance().getAttractionModel().getTitle());
        address.setText(DataClass.getInstance().getAttractionModel().getAddress());
        description.setText(DataClass.getInstance().getAttractionModel().getDescription());
        createSlider(DataClass.getInstance().getAttractionModel().getId());

        ImageView shareImageView = findViewById(R.id.share);
        shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = DataClass.getInstance().getAttractionModel().getTitle() + "\n" +
                        DataClass.getInstance().getAttractionModel().getAddress() + "\n" +
                        DataClass.getInstance().getAttractionModel().getDescription();
                String sub = DataClass.getInstance().getAttractionModel().getTitle();
                myIntent.putExtra(Intent.EXTRA_SUBJECT, sub);
                myIntent.putExtra(Intent.EXTRA_TEXT, body);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });

        final ImageView saveImageView = findViewById(R.id.save);
        if (DataClass.getInstance().getDbHelper().isSavedAttraction(DataClass.getInstance().getAttractionModel())) {
            saveImageView.setImageResource(R.drawable.saved_icon);
        } else {
            saveImageView.setImageResource(R.drawable.unsaved_icon);
        }
        saveImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DataClass.getInstance().getDbHelper().isSavedAttraction(DataClass.getInstance().getAttractionModel())) {
                    DataClass.getInstance().getDbHelper().deleteSavedAttraction(DataClass.getInstance().getAttractionModel());
                    saveImageView.setImageResource(R.drawable.unsaved_icon);
                } else {
                    DataClass.getInstance().getDbHelper().insertSavedAttraction(DataClass.getInstance().getAttractionModel());
                    saveImageView.setImageResource(R.drawable.saved_icon);
                }
            }
        });
    }

    private void createSlider(String attractionId) {
        ArrayList<PictureModel> pictureModels = DataClass.getInstance().getDbHelper().getAllPicturesByAttractionId(attractionId);
        urls = new ArrayList<>();
        for (PictureModel pictureModel : pictureModels) {
            urls.add(pictureModel.getImageUrl());
        }
        urls.add(DataClass.getInstance().getAttractionModel().getImageUrl());

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SliderAdapter(this, urls));
        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                int currentPage = mPager.getCurrentItem() + 1;
                if (currentPage >= urls.size()) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage, true);
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
