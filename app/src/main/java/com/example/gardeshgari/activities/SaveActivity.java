package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.gardeshgari.data.DataClass;
import com.example.gardeshgari.model.AttractionModel;
import com.example.gardeshgari.model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.AttractionAdapter;
import com.example.gardeshgari.adapter.SouvenirAdapter;
import com.example.gardeshgari.adapter.ViewPagerAdapter;
import com.example.gardeshgari.fragments.AttractionFragment;
import com.example.gardeshgari.fragments.SouvenirFragment;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SaveActivity extends AppCompatActivity {
    private SouvenirAdapter souvenirAdapter;
    private AttractionAdapter attractionAdapter;
    private ViewPager viewPager;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        ArrayList<SouvenirModel> souvenirModelArrayList = DataClass.getInstance().getDbHelper().getAllSavedSouvenirs();
        ArrayList<AttractionModel> attractionModels = DataClass.getInstance().getDbHelper().getAllSavedAttractions();
        souvenirAdapter = new SouvenirAdapter(this, souvenirModelArrayList);
        attractionAdapter = new AttractionAdapter(this, attractionModels);

        initializeUI();
    }

    private void initializeUI() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.viewPager = findViewById(R.id.viewpager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupViewPager();
    }

    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SouvenirFragment(souvenirAdapter), "سوغات");
        adapter.addFragment(new AttractionFragment(attractionAdapter), "جاذبه‌ها");
        viewPager.setAdapter(adapter);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        finish();
        startActivity(getIntent());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewPager.setAdapter(null);
    }
}
