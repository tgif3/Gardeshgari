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
import com.example.gardeshgari.model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.activities.SouvenirActivity;
import com.example.gardeshgari.imageUtils.ImageLoader;

import java.util.ArrayList;

public class SouvenirAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<SouvenirModel> souvenirModels;

    private LayoutInflater inflater;
    private ImageLoader imageLoader;

    public SouvenirAdapter(Context context, ArrayList<SouvenirModel> souvenirModels) {
        this.context = context;
        this.souvenirModels = souvenirModels;
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
        return souvenirModels.size();
    }

    @Override
    public Object getItem(int position) {
        return souvenirModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("InflateParams")
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null)
            view = inflater.inflate(R.layout.province_souvenir, null);

        TextView name = view.findViewById(R.id.name);
        ImageView image = view.findViewById(R.id.image);

        final ImageView saveImageView = view.findViewById(R.id.save);
        if (DataClass.getInstance().getDbHelper().isSavedSouvenir(souvenirModels.get(position))) {
            saveImageView.setImageResource(R.drawable.saved_icon);
        } else {
            saveImageView.setImageResource(R.drawable.unsaved_icon);
        }
        saveImageView.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (DataClass.getInstance().getDbHelper().isSavedSouvenir(souvenirModels.get(position))) {
                    DataClass.getInstance().getDbHelper().deleteSavedSouvenir(souvenirModels.get(position));
                    saveImageView.setImageResource(R.drawable.unsaved_icon);
                } else {
                    DataClass.getInstance().getDbHelper().insertSavedSouvenir(souvenirModels.get(position));
                    saveImageView.setImageResource(R.drawable.saved_icon);
                }
            }
        });

        ImageView shareImageView = view.findViewById(R.id.share);
        shareImageView.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String body = souvenirModels.get(position).getName() + "\n سوغات استان " +
                        souvenirModels.get(position).getProvince() + "\n" +
                        souvenirModels.get(position).getDescription();
                String sub = souvenirModels.get(position).getName();
                myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                myIntent.putExtra(Intent.EXTRA_TEXT,body);
                context.startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });

        name.setText(souvenirModels.get(position).getName());
        imageLoader.DisplayImage(souvenirModels.get(position).getImageUrl(), image);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataClass.getInstance().setSouvenirModel(souvenirModels.get(position));
                Intent intent = new Intent(context, SouvenirActivity.class);
                context.startActivity(intent);
            }
        });

        return view;
    }
}
