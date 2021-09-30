package com.mona.newsapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class fullPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_page);

        Intent o=getIntent();
       String n= o.getExtras().getString("n");
       o.putExtra("n",50);
       setResult(101,o);

    }
}