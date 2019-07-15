package com.example.gardeshgari.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gardeshgari.Model.ProvinceModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.ProvinceAdapter;

import java.util.ArrayList;

public class ProvinceActivity extends AppCompatActivity {
    private ListView listView;
    private Context context;
    private ArrayList<ProvinceModel> provinceModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);

        this.context = this;

        provinceModels = HomeActivity.getDbHelper().getAllProvinces();

        initializeUI();
    }

    private void initializeUI() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listView);
        listView.setAdapter(new ProvinceAdapter(this, provinceModels));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                ItemActivity.setProvinceModel(provinceModels.get(position));
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
}
