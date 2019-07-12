package com.example.gardeshgari.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.AttractionProvinceAdapter;

import java.util.ArrayList;

public class ProvinceAttractionsActivity extends AppCompatActivity {
    private static LayoutInflater layoutInflater = null;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province_attractions);

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listView = findViewById(R.id.listView);
        ArrayList<AttractionModel> attractionModels = MainActivity.getDbHelper().getAttractionsByProvince("تهران");

        listView.setAdapter(new AttractionProvinceAdapter(this, attractionModels));
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
