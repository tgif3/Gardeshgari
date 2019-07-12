package com.example.gardeshgari.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gardeshgari.Model.ProvinceModel;
import com.example.gardeshgari.Model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.ProvinceAdapter;

import java.util.ArrayList;

public class ProvinceActivity extends AppCompatActivity {
    private static LayoutInflater layoutInflater = null;
    private ListView listView;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);
        this.context = this;

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listView = findViewById(R.id.listView);
        final ArrayList<ProvinceModel> provinceModels = MainActivity.getDbHelper().getAllProvinces();
        listView.setAdapter(new ProvinceAdapter(this, provinceModels));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                ProvinceModel provinceModel = provinceModels.get(position);
                SouvenirActivity.setProvinceModel(provinceModel);
                ProvinceAttractionsActivity.setProvinceModel(provinceModel);
                Intent intent = new Intent(context, ProvinceAttractionsActivity.class);
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
