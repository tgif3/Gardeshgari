package com.example.gardeshgari.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gardeshgari.model.AttractionModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.imageUtils.ImageLoader;

import java.util.ArrayList;

public class HorizontalAdapter extends BaseAdapter {

    private ArrayList<AttractionModel> attractionModels;

    private LayoutInflater inflater;
    private ImageLoader imageLoader;

    public HorizontalAdapter(Context context, ArrayList<AttractionModel> attractionModels) {
        this.attractionModels = attractionModels;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader = new ImageLoader(context.getApplicationContext());
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return attractionModels.size();
    }

    @Override
    public Object getItem(int position) {
        return attractionModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("InflateParams")
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null)
            view = inflater.inflate(R.layout.attraction_in_home, null);

        TextView text = view.findViewById(R.id.text);
        ImageView image = view.findViewById(R.id.image);

        text.setText(attractionModels.get(position).getTitle());
        imageLoader.DisplayImage(attractionModels.get(position).getImageUrl(), image);

        return view;
    }
}
