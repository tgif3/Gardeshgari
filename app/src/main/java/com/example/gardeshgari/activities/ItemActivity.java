package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;

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
    private static LayoutInflater layoutInflater = null;
    private static SouvenirAdapter souvenirAdapter;
    private static AttractionProvinceAdapter attractionProvinceAdapter;
    private TabLayout tabLayout;
    public ViewPager viewPager;
    private Toolbar toolbar;
    private static ProvinceModel provinceModel;

    public static SouvenirAdapter getSouvenirAdapter() {
        return souvenirAdapter;
    }

    public static AttractionProvinceAdapter getAttractionProvinceAdapter() {
        return attractionProvinceAdapter;
    }

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setTitle("استان " + provinceModel.getName());

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ArrayList<SouvenirModel> souvenirModelArrayList = HomeActivity.getDbHelper().getSouvenirByProvince(provinceModel.getName());
        ArrayList<AttractionModel> attractionModels = HomeActivity.getDbHelper().getAttractionsByProvince(provinceModel.getName());
        souvenirAdapter = new SouvenirAdapter(this, souvenirModelArrayList);
        attractionProvinceAdapter = new AttractionProvinceAdapter(this, attractionModels);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SouvenirFragment(), "سوغات");
        adapter.addFragment(new AttractionFragment(), "جاذبه‌های گردشگری");
        viewPager.setAdapter(adapter);
    }

    public static void setProvinceModel(ProvinceModel provinceModel) {
        ItemActivity.provinceModel = provinceModel;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.province_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.home) {
//            Intent intent = new Intent(this, HomeActivity.class);
//            startActivity(intent);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public boolean onKeyDown(int keyCode, KeyEvent event)  {
//        if (Integer.parseInt(android.os.Build.VERSION.SDK) > 5
//                && keyCode == KeyEvent.KEYCODE_BACK
//                && event.getRepeatCount() == 0) {
//            onBackPressed();
//            return true;
//        }
//        return super.onKeyDown(keyCode, event);
//    }
//
//    @Override
//    public void onBackPressed() {
//        Intent intent = new Intent(this, ProvinceActivity.class);
//        startActivity(intent);
//    }
}
