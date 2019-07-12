package com.example.gardeshgari.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.example.gardeshgari.Model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.SouvenirAdapter;

import java.util.ArrayList;

public class SouvenirActivity extends AppCompatActivity {
    private static LayoutInflater layoutInflater = null;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souvenir);

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listView = findViewById(R.id.listView);
        ArrayList<SouvenirModel> souvenirModelArrayList = MainActivity.getDbHelper().getSouvenirByProvince("یزد");
        listView.setAdapter(new SouvenirAdapter(this, souvenirModelArrayList));
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
