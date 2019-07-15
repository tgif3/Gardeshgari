package com.example.gardeshgari.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.gardeshgari.R;
import com.example.gardeshgari.adapter.SouvenirAdapter;

@SuppressLint("ValidFragment")
public class SouvenirFragment extends Fragment {

    private ListView listView;
    private SouvenirAdapter souvenirAdapter;

    public SouvenirFragment(SouvenirAdapter souvenirAdapter) {
        this.souvenirAdapter = souvenirAdapter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_souvenir, container, false);

        listView = view.findViewById(R.id.listView);
        if (souvenirAdapter.getCount() > 0) {
            listView.setAdapter(souvenirAdapter);
        }

        return view;
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
