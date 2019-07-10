package com.example.gardeshgari;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.gardeshgari.HorizontalListView;
import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.HorizontalAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, OstanAttractionsActivity.class);
        startActivity(intent);

    }
}
