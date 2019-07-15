package com.example.gardeshgari.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gardeshgari.Model.ProvinceModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.ProvinceAdapter;

import java.util.ArrayList;

public class ProvinceActivity extends AppCompatActivity {
    private static LayoutInflater layoutInflater = null;
    private ListView listView;
    private Context context;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);
        this.context = this;

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listView = findViewById(R.id.listView);
        final ArrayList<ProvinceModel> provinceModels = HomeActivity.getDbHelper().getAllProvinces();
        listView.setAdapter(new ProvinceAdapter(this, provinceModels));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                ProvinceModel provinceModel = provinceModels.get(position);
                ItemActivity.setProvinceModel(provinceModel);
                Intent intent = new Intent(context, ItemActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
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
//
//    @Override
//    public void onBackPressed() {
//        Intent setIntent = new Intent(this, HomeActivity.class);
//        startActivity(setIntent);
//    }
}
