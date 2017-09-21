package com.pinkycindy.menghitungluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lgn = (Button) findViewById(R.id.Lingkaran);
        Button psg = (Button) findViewById(R.id.button2);
        Button tps = (Button) findViewById(R.id.button3);

        lgn.setOnClickListener(new OnClickListener(){
           @Override
            public  void onClick(View view){
               Intent lgnIntent = new Intent(MainActivity.this, LingkaranActivity.class);

               startActivity(lgnIntent);
           }
        });

        psg.setOnClickListener(new OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent psgIntent = new Intent(MainActivity.this, PersegiActivity.class);

                startActivity(psgIntent);
            }
        });
        tps.setOnClickListener(new OnClickListener(){
            @Override
            public  void onClick(View view){
                Intent tpsIntent = new Intent(MainActivity.this, PersegiActivity.class);

                startActivity(tpsIntent);
            }
        });

    }
}
