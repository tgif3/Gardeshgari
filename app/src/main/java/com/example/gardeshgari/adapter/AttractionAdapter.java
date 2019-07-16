package com.example.gardeshgari.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gardeshgari.data.DataClass;
import com.example.gardeshgari.model.AttractionModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.imageUtils.ImageLoader;

import java.util.ArrayList;

public class AttractionAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<AttractionModel> attractionModels;

    private LayoutInflater inflater;
    private ImageLoader imageLoader;

    public AttractionAdapter(Context context, ArrayList<AttractionModel> attractionModels) {
        this.context = context;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null)
            view = inflater.inflate(R.layout.province_attraction, null);

        TextView text = view.findViewById(R.id.name);
        TextView address = view.findViewById(R.id.address);
        ImageView image = view.findViewById(R.id.image);

        final ImageView saveImageView = view.findViewById(R.id.save);
        if (DataClass.getInstance().getDbHelper().isSavedAttraction(attractionModels.get(position))) {
            saveImageView.setImageResource(R.drawable.saved);
        } else {
            saveImageView.setImageResource(R.drawable.unsaved);
        }
        saveImageView.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (DataClass.getInstance().getDbHelper().isSavedAttraction(attractionModels.get(position))) {
                    DataClass.getInstance().getDbHelper().deleteSavedAttraction(attractionModels.get(position));
                    saveImageView.setImageResource(R.drawable.unsaved);
                } else {
                    DataClass.getInstance().getDbHelper().insertSavedAttraction(attractionModels.get(position));
                    saveImageView.setImageResource(R.drawable.saved);
                }
            }
        });

        ImageView shareImageView = view.findViewById(R.id.share);
        shareImageView.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = attractionModels.get(position).getTitle() + "\n" +
                        attractionModels.get(position).getAddress() + "\n" +
                        attractionModels.get(position).getDescription();
                String sub = attractionModels.get(position).getTitle();
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                context.startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });

        address.setText(attractionModels.get(position).getAddress());
        text.setText(attractionModels.get(position).getTitle());
        imageLoader.DisplayImage(attractionModels.get(position).getImageUrl(), image);

        return view;
    }
}
