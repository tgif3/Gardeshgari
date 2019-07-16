package com.example.gardeshgari.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gardeshgari.DataClass;
import com.example.gardeshgari.R;
import com.example.gardeshgari.imageUtils.ImageLoader;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

@SuppressLint("StaticFieldLeak")

public class SouvenirActivity extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    private Context context;

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

        name.setText(DataClass.getInstance().getSouvenirModel().getName());
        description.setText(DataClass.getInstance().getSouvenirModel().getDescription());

        ImageView image = findViewById(R.id.image);
        ImageLoader imageLoader = new ImageLoader(context.getApplicationContext());
        imageLoader.DisplayImage(DataClass.getInstance().getSouvenirModel().getImageUrl(), image);

        final ImageView saveImageView = findViewById(R.id.save);
        if (DataClass.getInstance().getDbHelper().isSavedSouvenir(DataClass.getInstance().getSouvenirModel())) {
            saveImageView.setImageResource(R.drawable.saved);
        } else {
            saveImageView.setImageResource(R.drawable.unsaved);
        }
        saveImageView.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (DataClass.getInstance().getDbHelper().isSavedSouvenir(DataClass.getInstance().getSouvenirModel())) {
                    DataClass.getInstance().getDbHelper().deleteSavedSouvenir(DataClass.getInstance().getSouvenirModel());
                    saveImageView.setImageResource(R.drawable.unsaved);
                } else {
                    DataClass.getInstance().getDbHelper().insertSavedSouvenir(DataClass.getInstance().getSouvenirModel());
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
                String body = DataClass.getInstance().getSouvenirModel().getName() + "\n سوغات استان " +
                        DataClass.getInstance().getSouvenirModel().getProvince() + "\n" +
                        DataClass.getInstance().getSouvenirModel().getDescription();
                String sub = DataClass.getInstance().getSouvenirModel().getName();
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                context.startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });
    }
}
