package com.example.gardeshgari.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gardeshgari.R;

public class SouvenirFragment extends Fragment {

    private View view;
    private TextView textView;
    private ListView listView;

    public SouvenirFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_souvenir, container, false);

        listView = view.findViewById(R.id.listView);
        listView.setAdapter(ItemActivity.getSouvenirAdapter());

        return view;
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
