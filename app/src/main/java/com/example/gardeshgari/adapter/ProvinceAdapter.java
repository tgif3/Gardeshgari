package com.example.gardeshgari.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.gardeshgari.Model.ProvinceModel;
import com.example.gardeshgari.R;
import com.example.gardeshgari.imageUtils.ImageLoader;

import java.util.ArrayList;

public class ProvinceAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ProvinceModel> provinceModels;

    private static LayoutInflater inflater=null;
    private ImageLoader imageLoader;

    public ProvinceAdapter(Context context, ArrayList<ProvinceModel> provinceModels) {
        this.context = context;
        this.provinceModels = provinceModels;
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
        return provinceModels.size();
    }

    @Override
    public Object getItem(int position) {
        return provinceModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null)
            view = inflater.inflate(R.layout.province_item, null);

        TextView text = view.findViewById(R.id.name);
        ImageView image = view.findViewById(R.id.image);

        text.setText(provinceModels.get(position).getName());
        imageLoader.DisplayImage(provinceModels.get(position).getImageUrl(), image);

        return view;
    }
}
