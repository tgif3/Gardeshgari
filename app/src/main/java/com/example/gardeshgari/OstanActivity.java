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
        ArrayList<OstanModel> ostanModels = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ostanModels.add(new OstanModel("تهران", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Aerial_View_of_Tehran_26.11.2008_04-35-03.JPG/300px-Aerial_View_of_Tehran_26.11.2008_04-35-03.JPG"));
        }

        listView.setAdapter(new OstanAdapter(this, ostanModels));
    }

    private void createItem(OstanModel ostanModel) {
        View view = layoutInflater.inflate(R.layout.ostan_item, null);
        TextView nameTextView = view.findViewById(R.id.name);
        ImageView imageView = view.findViewById(R.id.image);
        nameTextView.setText(ostanModel.getName());
    }


    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }








}
