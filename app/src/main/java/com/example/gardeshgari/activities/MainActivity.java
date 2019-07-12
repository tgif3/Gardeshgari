package com.example.gardeshgari.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.gardeshgari.DBHelper;
import com.example.gardeshgari.R;

public class MainActivity extends Activity {
    private static DBHelper dbHelper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this, "database");
        dbHelper.readAttractions();
        dbHelper.readProvinces();
        dbHelper.readSouvenirs();
        dbHelper.readPictures();

        Intent intent = new Intent(this, AttractionActivity.class);
        startActivity(intent);
    }

    public static DBHelper getDbHelper() {
        return dbHelper;
    }
}
