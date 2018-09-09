package com.example.jesmin.myfavouritenewspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class LocalPaperActivity extends AppCompatActivity {
    ListView customList;
    String localPp[]={"পূর্বকোণ","আজাদী"};
    int flags3[]={R.drawable.purbokone,R.drawable.azadi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_paper);
        customList=findViewById(R.id.listview3);
        CustomAdaptor adaptor=new CustomAdaptor(LocalPaperActivity.this,localPp,flags3);
        customList.setAdapter((ListAdapter) adaptor);
        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent=new Intent(LocalPaperActivity.this,WebActivity.class);
                intent.putExtra("url",localPp[position]);
                Toast.makeText(LocalPaperActivity.this,localPp[position], Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }

        });
    }
}
