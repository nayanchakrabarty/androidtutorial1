package com.example.androidtutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    TextView soroborno,banjonborno,number,alphabet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soroborno = findViewById(R.id.tvSorborno);
        banjonborno = findViewById(R.id.tvBanjon);
        number = findViewById(R.id.tvDigit);
        alphabet = findViewById(R.id.tvABC);


        final HashMap<String,String> sorobornolist=new HashMap<>();
        sorobornolist.put("অ","অজগর");
        sorobornolist.put("আ","আম");

        final HashMap<String,String> banjonlist=new HashMap<>();
        banjonlist.put("ক","কাক");
        banjonlist.put("খ","খই");

        final Intent i=new Intent(this,DataActivity.class);



        soroborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("datatype",sorobornolist);
                startActivity(i);
            }
        });
        banjonborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("datatype",banjonlist);
                startActivity(i);

            }
        });
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        alphabet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


}
