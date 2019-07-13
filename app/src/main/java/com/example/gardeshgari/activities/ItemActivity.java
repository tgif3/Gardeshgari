package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.example.gardeshgari.Model.ProvinceModel;
import com.example.gardeshgari.Model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.SouvenirAdapter;

import java.util.ArrayList;
import java.util.List;

public class ItemActivity extends AppCompatActivity {
    private static LayoutInflater layoutInflater = null;
    private static SouvenirAdapter souvenirAdapter;
    private TabLayout tabLayout;
    public ViewPager viewPager;
    private Toolbar toolbar;
    private static Context context;
    private static ProvinceModel provinceModel;

    public static SouvenirAdapter getSouvenirAdapter() {
        return souvenirAdapter;
    }

    public static void setSouvenirAdapter(SouvenirAdapter souvenirAdapter) {
        ItemActivity.souvenirAdapter = souvenirAdapter;
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

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ArrayList<SouvenirModel> souvenirModelArrayList = MainActivity.getDbHelper().getSouvenirByProvince(provinceModel.getName());
        souvenirAdapter = new SouvenirAdapter(this, souvenirModelArrayList);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SouvenirFragment(), "ONE");
//        adapter.addFragment(new TwoFragment(), "TWO");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    public static ProvinceModel getProvinceModel() {
        return provinceModel;
    }

    public static void setProvinceModel(ProvinceModel provinceModel) {
        ItemActivity.provinceModel = provinceModel;
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        ItemActivity.context = context;
    }
}
