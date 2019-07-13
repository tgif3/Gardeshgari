package com.example.gardeshgari.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gardeshgari.R;
import com.example.gardeshgari.activities.ItemActivity;

public class SouvenirFragment extends Fragment {

    private View view;
    private ListView listView;

    public SouvenirFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_souvenir, container, false);

        listView = view.findViewById(R.id.listView);
        if (ItemActivity.getSouvenirAdapter().getCount() > 0) {
            listView.setAdapter(ItemActivity.getSouvenirAdapter());
        }

        return view;
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
