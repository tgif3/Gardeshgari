package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.gardeshgari.DBHelper;
import com.example.gardeshgari.HorizontalListView;
import com.example.gardeshgari.initializeClass;
import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.AttractionType;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.HorizontalAdapter;
import com.example.gardeshgari.adapter.SliderAdapter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

@SuppressLint("StaticFieldLeak")
public class HomeActivity extends AppCompatActivity {
    private static DBHelper dbHelper;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private ArrayList<AttractionModel> sliderAttractions = new ArrayList<>();
    private static LayoutInflater layoutInflater = null;
    private ArrayList<HorizontalListView> horizontalListViews;

    private Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        context = this;

        setTitle("Gardeshgari");

        createDatabase();


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        horizontalListViews = new ArrayList<>();
        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        initialUI();
    }

    private void initialUI() {
        createListView(dbHelper.getAttractionsByType(AttractionType.natural.toString()), "جاذبه‌های طبیعی");
        createListView(dbHelper.getAttractionsByType(AttractionType.coast.toString()), "سواحل شمال و جنوب");
        createListView(dbHelper.getAttractionsByType(AttractionType.health.toString()), "گردشگری و سلامت");
        createListView(dbHelper.getAttractionsByType(AttractionType.historical.toString()), "تاریخی و فرهنگی");
        createListView(dbHelper.getAttractionsByType(AttractionType.museum.toString()), "موزه‌ها");
        createListView(dbHelper.getAttractionsByType(AttractionType.shopping.toString()), "مراکز خرید");
        createListView(dbHelper.getAttractionsByType(AttractionType.amusementPark.toString()), "شهربازی‌ها");
        createSlider();
    }

    private void createListView(ArrayList<AttractionModel> attractionModels, String title) {
        @SuppressLint("InflateParams") View attractionListView1 = layoutInflater.inflate(R.layout.attraction_list_view, null);
        HorizontalListView horizontalListView = attractionListView1.findViewById(R.id.HorizontalListView);
        HorizontalAdapter horizontalAdapter = new HorizontalAdapter(this, attractionModels);
        horizontalListView.setAdapter(horizontalAdapter);
        LinearLayout linearLayout = attractionListView1.findViewById(R.id.linearLayout);
        TextView titleTextView = linearLayout.findViewById(R.id.title);
        titleTextView.setText(title);

        horizontalListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                AttractionModel attractionModel = (AttractionModel)
                        parent.getAdapter().getItem(position);
                AttractionActivity.setAttractionModel(attractionModel);
                Intent intent = new Intent(context, AttractionActivity.class);
                startActivity(intent);
            }
        });

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

    private void createSlider() {
        sliderAttractions = dbHelper.getPicturesForSlider();
        ArrayList<String> imageUrls = new ArrayList<>();
        for (AttractionModel attractionModel : sliderAttractions) {
            imageUrls.add(attractionModel.getImageUrl());
        }
        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SliderAdapter(this, imageUrls));
        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == sliderAttractions.size()) {
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
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.province:
                intent = new Intent(this, ProvinceActivity.class);
                startActivity(intent);
                break;
            case R.id.save:
                intent = new Intent(this, SaveActivity.class);
                startActivity(intent);
                break;
            case R.id.team:
                new AlertDialog.Builder(this)
                        .setMessage("علیرضا نائیجی\nمحمد حقیقت\nحسین بهبودی").show();
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)  {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) > 5
                && keyCode == KeyEvent.KEYCODE_BACK
                && event.getRepeatCount() == 0) {
            onBackPressed();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("آيا مطمئن هستيد كه مي خواهيد از برنامه خارج شويد؟")
                .setCancelable(false)
                .setPositiveButton("بله", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("خیر", null)
                .show();
    }
    
    public static DBHelper getDbHelper() {
        return dbHelper;
    }

    private void createDatabase() {
        dbHelper = new DBHelper(this, "database");
        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        if (!sharedPreferences.contains("database")) {
            new initializeClass(dbHelper);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("database", true);
            editor.apply();
        }
    }
}
