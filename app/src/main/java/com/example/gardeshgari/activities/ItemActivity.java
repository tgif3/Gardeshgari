package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.ProvinceModel;
import com.example.gardeshgari.Model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.AttractionProvinceAdapter;
import com.example.gardeshgari.adapter.SouvenirAdapter;
import com.example.gardeshgari.adapter.ViewPagerAdapter;
import com.example.gardeshgari.fragments.AttractionFragment;
import com.example.gardeshgari.fragments.SouvenirFragment;

import java.util.ArrayList;

public class ItemActivity extends AppCompatActivity {
    private SouvenirAdapter souvenirAdapter;
    private AttractionProvinceAdapter attractionProvinceAdapter;
    public ViewPager viewPager;
    private static ProvinceModel provinceModel;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        ArrayList<SouvenirModel> souvenirModelArrayList = HomeActivity.getDbHelper().getSouvenirByProvince(provinceModel.getName());
        ArrayList<AttractionModel> attractionModels = HomeActivity.getDbHelper().getAttractionsByProvince(provinceModel.getName());
        souvenirAdapter = new SouvenirAdapter(this, souvenirModelArrayList);
        attractionProvinceAdapter = new AttractionProvinceAdapter(this, attractionModels);

        initializeUI();
    }

    private void initializeUI() {
        viewPager = findViewById(R.id.viewpager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupViewPager();
    }

    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SouvenirFragment(souvenirAdapter), "سوغات");
        adapter.addFragment(new AttractionFragment(attractionProvinceAdapter), "جاذبه‌های گردشگری");
        viewPager.setAdapter(adapter);
    }

    public static void setProvinceModel(ProvinceModel provinceModel) {
        ItemActivity.provinceModel = provinceModel;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewPager.setAdapter(null);
    }
}
