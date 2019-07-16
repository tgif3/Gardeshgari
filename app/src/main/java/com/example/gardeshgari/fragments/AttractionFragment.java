package com.example.gardeshgari.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gardeshgari.data.DataClass;
import com.example.gardeshgari.model.AttractionModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.activities.AttractionActivity;
import com.example.gardeshgari.adapter.AttractionAdapter;

@SuppressLint("ValidFragment")
public class AttractionFragment extends Fragment {
    private ListView listView;
    private AttractionAdapter attractionAdapter;

    public AttractionFragment(AttractionAdapter attractionAdapter) {
        this.attractionAdapter = attractionAdapter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attraction, container, false);

        listView = view.findViewById(R.id.listView);
        if (attractionAdapter.getCount() > 0) {
            listView.setAdapter(attractionAdapter);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                AttractionModel attractionModel =
                        (AttractionModel) attractionAdapter.getItem(position);
                DataClass.getInstance().setAttractionModel(attractionModel);
                Intent intent = new Intent(getActivity(), AttractionActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
