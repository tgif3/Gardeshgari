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
        description.setText("پل طبیعت عنوان یک پل سه طبقه در منطقه عباس آباد تهران است که بر روی عرض بزرگراه مدرس قرار گرفته و تنها به عابران پیاده اختصاص دارد. این پل یک راه ارتباطی میان پارک های طالقانی و آب و آتش فراهم آورده است و این دو پارکِ شاخص پایتخت را به هم متصل می کند.\n" +
                "\n" +
                "نورپردازی خاص و ویژگی های منحصر به فرد این پل، بسیاری از افراد را به ویژه در شب به سوی خود می کشاند و لحظاتی رویایی را در قلب شهر تهران برای شان رقم می زند. این سازه با طول 300 متر در ارتفاع 40 متری از سطح زمین ساخته شده است و امکان تماشای چشم اندازی زیبا از تهران را به شما می دهد. وجود کافه ها و رستوران ها باعث شده تا پل طبیعت مقصدی جذاب برای شکم گردی باشد و گردشگران را برای چشیدن طعم های جذاب به سوی خود بکشاند. بد نیست بدانید پل طبیعت عنوان نخستین پل غیرخودرویی در کشور و بزرگترین پل غیرخودرویی خاورمیانه را به خود اختصاص داده است. \n" +
                "\n");
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
