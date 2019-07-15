package com.example.gardeshgari.activities;

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
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gardeshgari.DBHelper;
import com.example.gardeshgari.HorizontalListView;
import com.example.gardeshgari.InitialClass;
import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.AttractionType;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.HorizontalAdapter;
import com.example.gardeshgari.adapter.SliderAdapter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class HomeActivity extends AppCompatActivity {
    private static DBHelper dbHelper;
    private static ViewPager mPager;
    private static int currentPage = 0;
    private ArrayList<String> urls = new ArrayList<>();
    private static LayoutInflater layoutInflater = null;
    private ArrayList<HorizontalListView> horizontalListViews;
    private Toolbar toolbar;
    private Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_attraction);

        dbHelper = new DBHelper(this, "database");

        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        if (!sharedPreferences.contains("database")) {
            new InitialClass(dbHelper);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("database", true);
            editor.apply();
        }
        
        context = this;

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        horizontalListViews = new ArrayList<>();
        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        createListView(dbHelper.getAttractionsByType(AttractionType.natural.toString()), "جاذبه‌های طبیعی");
        createListView(dbHelper.getAttractionsByType(AttractionType.coast.toString()), "سواحل شمال و جنوب");
        createListView(dbHelper.getAttractionsByType(AttractionType.health.toString()), "گردشگری و سلامت");
        createListView(dbHelper.getAttractionsByType(AttractionType.historical.toString()), "تاریخی و فرهنگی");
        createListView(dbHelper.getAttractionsByType(AttractionType.museum.toString()), "موزه‌ها");
        createListView(dbHelper.getAttractionsByType(AttractionType.shopping.toString()), "مراکز خرید");
        createListView(dbHelper.getAttractionsByType(AttractionType.amusementPark.toString()), "شهربازی‌ها");
        init();
    }

    private void createListView(ArrayList<AttractionModel> attractionModels, String title) {
        View attractionListView1 = layoutInflater.inflate(R.layout.attraction_list_view, null);
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
                AttractionActivity.setCallByHome(true);
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

    private void init() {
        for (int i = 0; i < 10; i++) {
            urls.add("https://cdn.isna.ir/d/2016/10/20/3/57371326.jpg?ts=1498045331768");
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.province) {
            Intent intent = new Intent(this, ProvinceActivity.class);
            startActivity(intent);
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
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
    
    public static DBHelper getDbHelper() {
        return dbHelper;
    }
}
