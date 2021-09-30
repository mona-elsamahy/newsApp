package com.mona.newsapp;

import android.content.Intent;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class newsList extends AppCompatActivity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_list);
        listView = (ListView) findViewById(R.id.newList);

        List<news> n = new ArrayList<>();
        String title[] = {" the Ministy of Higher Education", " the Ministry of Health", "sports","Android"};
        int images[] = {R.drawable.college, R.drawable.health, R.drawable.football,R.drawable.android};
        String detail[] = {"The Minister of Higher Education announces that the start of the study is 9 October", "The Ministry of Health announces that the number of deaths in Egypt this year 50000", "Mohamed Salah suffers a broken leg and retires from playing for two months","Google ends support for the most popular versions of Android"};

        for (int i = 0; i < title.length; i++) {
            news obj = new news(title[i], images[i], detail[i]);
            news.add(obj);
        }

        myadapter adapter = new myadapter(n);
        listView.setAdapter(adapter);
    }

    public void call() {
        Intent i =new Intent(newsList.this,fullPage.class);
        i.putExtra("n","high");
        onActivityResult(101,101,i);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==101 & requestCode==101){


            String s=data.getExtras().getString("n");
            Toast.makeText(newsList.this,s,Toast.LENGTH_LONG).show();
        }



    }
}