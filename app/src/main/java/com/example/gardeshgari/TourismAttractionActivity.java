package com.example.gardeshgari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.adapter.HorizontalAdapter;

import java.util.ArrayList;

public class TourismAttractionActivity extends AppCompatActivity {

    private HorizontalListView horizontalListView;
    private HorizontalAdapter horizontalAdapter;
    private ArrayList<AttractionModel> attractionModelArrayList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_attraction);

        updateData();

        horizontalListView = findViewById(R.id.HorizontalListView);
        horizontalAdapter = new HorizontalAdapter(this, attractionModelArrayList);
        horizontalListView.setAdapter(horizontalAdapter);
    }

    @Override
    public void onDestroy() {
        horizontalListView.setAdapter(null);
        super.onDestroy();
    }

    private void updateData() {
        attractionModelArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            attractionModelArrayList.add(new AttractionModel("Title " + (i + 1),
                    "https://cdnw.elicdn.com/Blog/wp-content/uploads/2017/12/01iran.jpg"));
        }
    }
}
