package com.example.gardeshgari;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
    private static DBHelper dbHelper;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbHelper = new DBHelper(this, "database");
        dbHelper.readAttractions();
        dbHelper.readOstans();
        dbHelper.readSouvenirs();

        Intent intent = new Intent(this, SouvenirActivity.class);
        startActivity(intent);
    }

    public static DBHelper getDbHelper() {
        return dbHelper;
    }
}
