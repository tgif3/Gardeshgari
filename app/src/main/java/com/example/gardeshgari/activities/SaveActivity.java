package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
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
        setContentView(R.layout.activity_item);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = findViewById(R.id.viewpager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setTitle("");

        ArrayList<SouvenirModel> souvenirModelArrayList = HomeActivity.getDbHelper().getSouvenirByProvince("تهران");
        ArrayList<AttractionModel> attractionModels = HomeActivity.getDbHelper().getAllSavedAttractions();
        souvenirAdapter = new SouvenirAdapter(this, souvenirModelArrayList);
        attractionProvinceAdapter = new AttractionProvinceAdapter(this, attractionModels);
        setupViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        SouvenirFragment souvenirFragment = new SouvenirFragment(souvenirAdapter);
        AttractionFragment attractionFragment = new AttractionFragment(attractionProvinceAdapter);
        adapter.addFragment(souvenirFragment, "سوغات ذخیره‌شده");
        adapter.addFragment(attractionFragment, "جاذبه‌های گردشگری ذخیره‌شده");
        viewPager.setAdapter(adapter);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        finish();
        startActivity(getIntent());
    }
}