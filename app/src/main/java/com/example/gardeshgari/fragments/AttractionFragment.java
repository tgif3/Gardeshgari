package com.example.gardeshgari.fragments;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.activities.AttractionActivity;
import com.example.gardeshgari.activities.ItemActivity;
import com.example.gardeshgari.adapter.AttractionProvinceAdapter;

@SuppressLint("ValidFragment")
public class AttractionFragment extends Fragment {

    private View view;
    private ListView listView;
    private AttractionProvinceAdapter attractionProvinceAdapter;

    public AttractionFragment(AttractionProvinceAdapter attractionProvinceAdapter) {
        this.attractionProvinceAdapter = attractionProvinceAdapter;
    }

    public void setAttractionProvinceAdapter(AttractionProvinceAdapter attractionProvinceAdapter) {
        this.attractionProvinceAdapter = attractionProvinceAdapter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_attraction, container, false);

        listView = view.findViewById(R.id.listView);
        if (attractionProvinceAdapter.getCount() > 0) {
            listView.setAdapter(attractionProvinceAdapter);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                AttractionModel attractionModel =
                        (AttractionModel) attractionProvinceAdapter.getItem(position);
                AttractionActivity.setAttractionModel(attractionModel);
                AttractionActivity.setCallByHome(false);
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
