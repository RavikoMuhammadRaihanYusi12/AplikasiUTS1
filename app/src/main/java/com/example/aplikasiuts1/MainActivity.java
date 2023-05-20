package com.example.aplikasiuts1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView d1,d2,d3,d4,d5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d1 = (CardView) findViewById(R.id.d1unri);
        d2 = (CardView) findViewById(R.id.d2uin);
        d3 = (CardView) findViewById(R.id.d3uir);
        d4 = (CardView) findViewById(R.id.d4umri);
        d5 = (CardView) findViewById(R.id.d5pcr);

        d1.setOnClickListener((View.OnClickListener) this);
        d2.setOnClickListener((View.OnClickListener) this);
        d3.setOnClickListener((View.OnClickListener) this);
        d4.setOnClickListener((View.OnClickListener) this);
        d5.setOnClickListener((View.OnClickListener) this);
    }
    @Override
    public void onClick(View v){
        Intent i ;
        switch (v.getId()){
            case R.id.d1unri : i = new Intent(this,d1Unri.class); startActivity(i); break;
            case R.id.d2uin : i = new Intent(this,d2Uin.class); startActivity(i); break;
            case R.id.d3uir : i = new Intent(this,d3Uir.class); startActivity(i); break;
            case R.id.d4umri : i = new Intent(this,d4Umri.class); startActivity(i); break;
            case R.id.d5pcr : i = new Intent(this,d5Pcr.class); startActivity(i); break;


        }
    }

}