package com.example.androidtutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.androidtutorial1.R;

import java.util.ArrayList;
import java.util.HashMap;

public class DataActivity extends AppCompatActivity {

    LinearLayout mylayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        mylayout=findViewById(R.id.mylayout);

        Intent i = getIntent();
        HashMap<String,String> mydata = (HashMap<String, String>) i.getSerializableExtra("datatype");


        ArrayList<String>charlist=new ArrayList<>();
        charlist.addAll(mydata.keySet());

        LayoutInflater inflater=(LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        for(int j=0;j<charlist.size();j++){
            View vi=inflater.inflate(R.layout.datashow,null,false);

            TextView borno=vi.findViewById(R.id.borno);
            TextView bakko=vi.findViewById(R.id.udharon);

            borno.setText(charlist.get(j));
            bakko.setText(mydata.get(charlist.get(j)));
            mylayout.addView(vi);

        }








    }
}
