package com.example.gardeshgari;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gardeshgari.Model.OstanModel;
import com.example.gardeshgari.adapter.HorizontalAdapter;
import com.example.gardeshgari.adapter.OstanAdapter;

import java.util.ArrayList;

public class OstanActivity extends AppCompatActivity {
    private static LayoutInflater layoutInflater = null;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ostan);

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listView = findViewById(R.id.listView);
        ArrayList<OstanModel> ostanModels = MainActivity.getDbHelper().getAllOstans();
        listView.setAdapter(new OstanAdapter(this, ostanModels));
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
