package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.AttractionProvinceAdapter;
import com.example.gardeshgari.adapter.SouvenirAdapter;
import com.example.gardeshgari.adapter.ViewPagerAdapter;
import com.example.gardeshgari.fragments.AttractionFragment;
import com.example.gardeshgari.fragments.SouvenirFragment;

import java.util.ArrayList;

public class SaveActivity extends AppCompatActivity {
    private SouvenirAdapter souvenirAdapter;
    private AttractionProvinceAdapter attractionProvinceAdapter;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        ArrayList<SouvenirModel> souvenirModelArrayList = HomeActivity.getDbHelper().getAllSavedSouvenirs();
        ArrayList<AttractionModel> attractionModels = HomeActivity.getDbHelper().getAllSavedAttractions();
        souvenirAdapter = new SouvenirAdapter(this, souvenirModelArrayList);
        attractionProvinceAdapter = new AttractionProvinceAdapter(this, attractionModels);

        initializeUI();
    }

    private void initializeUI() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = findViewById(R.id.viewpager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SouvenirFragment(souvenirAdapter), "سوغات ذخیره‌شده");
        adapter.addFragment(new AttractionFragment(attractionProvinceAdapter), "جاذبه‌های گردشگری ذخیره‌شده");
        viewPager.setAdapter(adapter);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        finish();
        startActivity(getIntent());
    }
}
