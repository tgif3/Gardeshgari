package com.example.gardeshgari.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gardeshgari.R;
import com.example.gardeshgari.imageUtils.ImageLoader;

import java.util.ArrayList;

public class SliderAdapter extends PagerAdapter {

    private ArrayList<String> urls;
    private LayoutInflater inflater;
    private Context context;
    private ImageLoader imageLoader;

    public SliderAdapter(Context context, ArrayList<String> urls) {
        this.context = context;
        this.urls = urls;
        inflater = LayoutInflater.from(context);
        imageLoader = new ImageLoader(context.getApplicationContext());
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return urls.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slide, view, false);
        ImageView myImage = myImageLayout.findViewById(R.id.image);
        imageLoader.DisplayImage(urls.get(position), myImage);
        view.addView(myImageLayout, 0);

        return myImageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
