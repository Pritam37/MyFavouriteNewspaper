package com.example.jesmin.myfavouritenewspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class EnglishPaperActivity extends AppCompatActivity {
    ListView customList;
    String engPp[]={"Daily Star","Independent","Observer","Bangladesh Today","New Age","Daily Sun"};
    int flags2 []={R.drawable.dailystar,R.drawable.dailyindependent,R.drawable.observer,R.drawable.bdtody,R.drawable.newage,
            R.drawable.dailysun};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_paper);

        customList=findViewById(R.id.listview2);
        CustomAdaptor2 adaptor=new CustomAdaptor2(EnglishPaperActivity.this,engPp,flags2);
        customList.setAdapter((ListAdapter) adaptor);
        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(EnglishPaperActivity.this,WebActivity.class);
                intent.putExtra("url",engPp[position]);
                Toast.makeText(EnglishPaperActivity.this,engPp[position], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}
