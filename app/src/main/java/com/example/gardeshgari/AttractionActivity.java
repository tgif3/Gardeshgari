package com.example.gardeshgari;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.gardeshgari.adapter.SliderAdapter;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class AttractionActivity extends AppCompatActivity {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private ArrayList<String> urls = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);

        init();


        TextView name = findViewById(R.id.name);
        TextView address = findViewById(R.id.address);
        TextView description = findViewById(R.id.description);

        name.setText("پل طبیعت");
        address.setText("تهران بزرگراه مدرس");
        description.setText("پل طبیعت، یکی از قطب\u200Cهای گردشگری شهر تهران است که در چند سال گذشته مورد استقبال فراوانی قرار گرفته و تبدیل به یکی از نمادهای شهر شده است. شگفت\u200Cانگیزترین نکته در مورد پل طبیعت تهران این است که هرچند بین چندین اتوبان اصلی شهر قرار دارد و درست در مرکز شلوغی و ترافیک ساخته شده، اما احساسی از بودن در طبیعت و تنفس را به همراه دارد.\n" +
                "\n" +
                "وجود فضاهای سبز، مسیرهای پیاده\u200Cروی و دیدن آدم\u200Cهای با انرژی و خوشحالی که برای تفریح یا ورزش به پل طبیعت تهران می\u200Cآیند، حس شادابی و سرزندگی این فضا را دو چندان می\u200Cکند. در این مقاله من قصد دارم شما را به تور مجازی پل طبیعت میهمان کنم. اگر تا حالا از پل طبیعت دیدن نکرده\u200Cاید، همین آخر هفته فرصت مناسبی است که به آنجا بروید و یک پیاده\u200Cروی اساسی را تجربه کنید.\n");
    }

    private void init() {
        for (int i = 0; i < 10; i++) {
            urls.add("https://www.nabro.ir/wp-content/uploads/2019/03/%D9%BE%D9%84-%D8%B7%D8%A8%DB%8C%D8%B9%D8%AA-%D8%AA%D9%87%D8%B1%D8%A7%D9%86-%DB%B1-858x463.jpg");
        }

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SliderAdapter(this, urls));
        CircleIndicator indicator = findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == urls.size()) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 0, 3000);
    }
}
