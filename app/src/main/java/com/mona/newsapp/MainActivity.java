package com.mona.newsapp;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Handler h;
    Runnable r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h =new Handler();
        r=new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(MainActivity.this,newsList.class);
                startActivity(i);
            }
        };








    }

    @Override
    protected void onStart() {

        Toast.makeText(MainActivity.this,"start",Toast.LENGTH_LONG).show();
        h.postDelayed(r,300);
        super.onStart();
    }

    @Override
    protected void onStop() {
        Toast.makeText(MainActivity.this,"stop",Toast.LENGTH_LONG).show();
        super.onStop();
    }


    @Override
    protected void onResume() {
        Toast.makeText(MainActivity.this,"Resume",Toast.LENGTH_LONG).show();
        super.onResume();
    }


    @Override
    protected void onDestroy() {
        Toast.makeText(MainActivity.this,"destroy",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }


}