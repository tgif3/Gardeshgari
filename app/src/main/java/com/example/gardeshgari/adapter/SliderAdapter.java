package com.example.gardeshgari.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gardeshgari.R;
import com.example.gardeshgari.imageUtils.ImageLoader;

import java.util.ArrayList;

public class SliderAdapter extends PagerAdapter {

    private ArrayList<String> imageUrls;
    private LayoutInflater inflater;
    private ImageLoader imageLoader;

    public SliderAdapter(Context context, ArrayList<String> imageUrls) {
        this.imageUrls = imageUrls;
        inflater = LayoutInflater.from(context);
        imageLoader = new ImageLoader(context.getApplicationContext());
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return imageUrls.size();
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slide, view, false);
        ImageView myImage = myImageLayout.findViewById(R.id.image);
        imageLoader.DisplayImage(imageUrls.get(position), myImage);
        view.addView(myImageLayout, 0);

        return myImageLayout;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}
