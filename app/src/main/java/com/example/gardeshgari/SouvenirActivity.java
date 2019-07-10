package com.example.gardeshgari;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gardeshgari.Model.AttractionModel;
import com.example.gardeshgari.Model.OstanModel;
import com.example.gardeshgari.Model.SouvenirModel;
import com.example.gardeshgari.adapter.AttractionOstanAdapter;
import com.example.gardeshgari.adapter.OstanAdapter;
import com.example.gardeshgari.adapter.SouvenirAdapter;

import java.util.ArrayList;

public class SouvenirActivity extends AppCompatActivity {
    private static LayoutInflater layoutInflater = null;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souvenir);

        layoutInflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listView = findViewById(R.id.listView);
        ArrayList<SouvenirModel> souvenirModelArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            souvenirModelArrayList.add(new SouvenirModel("کیک یزدی",
                    "https://setare.com/files/fa/news/1396/8/27/102566_537.jpg",
                    "کیک یزدی یکی از معروف\u200Cترین خوراکی\u200Cهای مختص استان است که البته امروزه در ویترین بیشتر شیرینی فروشی\u200Cهای کشور یافت می\u200Cشود، اما اگر می\u200Cخواهید نوع اصل آن را میل کنید حتماً باید به یزد سفر کنید. این کیک از ترکیب آرد، روغن مایع، شکر، گلاب ، پودر هل و تخم\u200Cمرغ تهیه می\u200Cشود.\n"));
        }

        listView.setAdapter(new SouvenirAdapter(this, souvenirModelArrayList));
    }

    @Override
    public void onDestroy() {
        listView.setAdapter(null);
        super.onDestroy();
    }
}
