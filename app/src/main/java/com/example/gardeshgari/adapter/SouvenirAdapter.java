package com.example.gardeshgari.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gardeshgari.Model.SouvenirModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.imageUtils.ImageLoader;

import java.util.ArrayList;

public class SouvenirAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<SouvenirModel> souvenirModels;

    private static LayoutInflater inflater=null;
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

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null)
            view = inflater.inflate(R.layout.souvenir_item, null);

        TextView name = view.findViewById(R.id.name);
        TextView description = view.findViewById(R.id.description);
        ImageView image = view.findViewById(R.id.image);

        name.setText(souvenirModels.get(position).getName());
        description.setText(souvenirModels.get(position).getDescription());
        imageLoader.DisplayImage(souvenirModels.get(position).getUrl(), image);

        return view;
    }
}
