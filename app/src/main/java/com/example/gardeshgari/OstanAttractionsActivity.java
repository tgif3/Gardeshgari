package com.example.gardeshgari;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.OstanModel;
import com.example.gardeshgari.adapter.AttractionOstanAdapter;
import com.example.gardeshgari.adapter.OstanAdapter;

import java.util.ArrayList;

public class OstanAttractionsActivity extends AppCompatActivity {
    private static LayoutInflater layoutInflater = null;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ostan_attractions);

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listView = findViewById(R.id.listView);
        ArrayList<AttractionModel> attractionModels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            attractionModels.add(new AttractionModel.Builder()
                            .withTitle("جنگل سی سنگان نوشهر")
                    .withImageUrl("https://www.zistonline.com/uploadFiles/editor/Alangdareh-park.jpg")
                    .withAddress("استان مازندران، 30 كيلومتری جاده نوشهر به نور، پارک جنگلی سی سنگان")
                    .build());
        }

        listView.setAdapter(new AttractionOstanAdapter(this, attractionModels));
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
