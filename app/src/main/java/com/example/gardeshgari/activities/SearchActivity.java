package com.example.gardeshgari.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.gardeshgari.R;
import com.example.gardeshgari.data.DataClass;
import com.example.gardeshgari.model.AttractionModel;
import com.example.gardeshgari.model.SouvenirModel;

import java.util.ArrayList;
import java.util.Collections;

public class SearchActivity extends AppCompatActivity {
    private ArrayAdapter<String> listAdapter;
    private ArrayList<AttractionModel> attractionModels;
    private ArrayList<SouvenirModel> souvenirModels;
    private ListView itemList;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        this.context = this;

        EditText filterText = findViewById(R.id.editText);
        itemList = findViewById(R.id.listView);

        attractionModels = DataClass.getInstance().getDbHelper().getAllAttractions();
        souvenirModels = DataClass.getInstance().getDbHelper().getAllSouvenirs();

        ArrayList<String> names = new ArrayList<>();
        for (AttractionModel attractionModel : attractionModels) {
            names.add(attractionModel.getTitle());
        }
        for (SouvenirModel souvenirModel : souvenirModels) {
            names.add(souvenirModel.getName());
        }
        Collections.sort(names);

        final String[] listViewAdapterContent = new String[names.size()];
        for (int i = 0; i < listViewAdapterContent.length; i++) {
            listViewAdapterContent[i] = names.get(i);
        }

        listAdapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, android.R.id.text1, listViewAdapterContent);

        itemList.setAdapter(listAdapter);

        itemList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = String.valueOf(SearchActivity.this.listAdapter.getItem(position));
                for (AttractionModel attractionModel : attractionModels) {
                    if (attractionModel.getTitle().equals(str)) {
                        DataClass.getInstance().setAttractionModel(attractionModel);
                        Intent intent = new Intent(context, AttractionActivity.class);
                        startActivity(intent);
                    }
                }
                for (SouvenirModel souvenirModel : souvenirModels) {
                    if (souvenirModel.getName().equals(str)) {
                        DataClass.getInstance().setSouvenirModel(souvenirModel);
                        Intent intent = new Intent(context, SouvenirActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });

        filterText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                SearchActivity.this.listAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        itemList.setAdapter(null);
    }
}
