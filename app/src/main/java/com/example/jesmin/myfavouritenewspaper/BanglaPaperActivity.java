package com.example.jesmin.myfavouritenewspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BanglaPaperActivity extends AppCompatActivity {

    ListView customList;
    String banglaPp[]={"প্রথম আলো","কালের কন্ঠ","ইত্তেফাক","বাংলাদেশ প্রতিদিন","যুগান্তর","নয়া দিগন্ত","সমকাল",
            "ইনকিলাব","ভোরের কাগজ","যায় যায় দিন","জনকন্ঠ","মানবজমিন","সুপ্রভাত বাংলাদেশ"};
    int flags[]={R.drawable.prothomalo,R.drawable.kalerkantho,R.drawable.ittefaq,R.drawable.bdpratidin,R.drawable.jugantor,
            R.drawable.noyadigonto,R.drawable.samakal,R.drawable.inqilab,R.drawable.bhorerkagoz,R.drawable.zayzaydin,
            R.drawable.janakantha,R.drawable.mzamin,R.drawable.suprovatbangladesh};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_paper);

        customList=findViewById(R.id.listview);
        CustomAdaptor adaptor=new CustomAdaptor(BanglaPaperActivity.this,banglaPp,flags);
        customList.setAdapter((ListAdapter) adaptor);
        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(BanglaPaperActivity.this,WebActivity.class);
                intent.putExtra("url",banglaPp[position]);
                Toast.makeText(BanglaPaperActivity.this,banglaPp[position], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

        });
    }
}
