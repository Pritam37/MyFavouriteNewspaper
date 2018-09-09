package com.example.jesmin.myfavouritenewspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnBangla, btnEnglish, btnLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnBangla=findViewById(R.id.btn_bangla);
        btnEnglish=findViewById(R.id.btn_eng);
        btnLocal=findViewById(R.id.btn_local);

        btnBangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,BanglaPaperActivity.class);
                startActivity(intent);
            }
        });
        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,EnglishPaperActivity.class);
                startActivity(intent);
            }
        });
        btnLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity.this,LocalPaperActivity.class);
                startActivity(intent);
            }
        });

    }
}
