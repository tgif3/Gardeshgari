package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gardeshgari.Model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.imageUtils.ImageLoader;

@SuppressLint("StaticFieldLeak")

public class SouvenirActivity extends AppCompatActivity {

    private static SouvenirModel souvenirModel;
    private Context context;

    public static void setSouvenirModel(SouvenirModel souvenirModel) {
        SouvenirActivity.souvenirModel = souvenirModel;
    }

    @SuppressLint("CutPasteId")
    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souvenir);

        this.context = this;

        initializeUi();
    }

    private void initializeUi() {
        TextView name = findViewById(R.id.name);
        TextView description = findViewById(R.id.description);

        name.setText(souvenirModel.getName());
        description.setText(souvenirModel.getDescription());

        ImageView image = findViewById(R.id.image);
        ImageLoader imageLoader = new ImageLoader(context.getApplicationContext());
        imageLoader.DisplayImage(souvenirModel.getImageUrl(), image);

        final ImageView saveImageView = findViewById(R.id.save);
        if (HomeActivity.getDbHelper().isSavedSouvenir(souvenirModel)) {
            saveImageView.setImageResource(R.drawable.saved);
        } else {
            saveImageView.setImageResource(R.drawable.unsaved);
        }
        saveImageView.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (HomeActivity.getDbHelper().isSavedSouvenir(souvenirModel)) {
                    HomeActivity.getDbHelper().deleteSavedSouvenir(souvenirModel);
                    saveImageView.setImageResource(R.drawable.unsaved);
                } else {
                    HomeActivity.getDbHelper().insertSavedSouvenir(souvenirModel);
                    saveImageView.setImageResource(R.drawable.saved);
                }
            }
        });

        ImageView shareImageView = findViewById(R.id.share);
        shareImageView.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = souvenirModel.getName() + "\n سوغات استان " +
                        souvenirModel.getProvince() + "\n" +
                        souvenirModel.getDescription();
                String sub = souvenirModel.getName();
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                context.startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });
    }
}
