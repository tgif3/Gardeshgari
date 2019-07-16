package com.example.gardeshgari.base.application;

import android.app.Application;

import com.example.gardeshgari.R;
import com.example.gardeshgari.base.utility.FontUtils;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // FONT
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath(FontUtils.IRAN_SANS_FONT)
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}