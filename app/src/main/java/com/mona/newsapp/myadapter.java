package com.mona.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class myadapter extends BaseAdapter {
    List<news> n;
    public myadapter(List<news> n) {
        this.n=n;

    }

    @Override
    public int getCount() {
        return n.size();
    }

    @Override
    public news getItem(int position) {
        return n.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewfolder holder;
        if(convertView==null)
        {
            LayoutInflater inflater=LayoutInflater.from(convertView.getContext());
            convertView=inflater.inflate(R.layout.newslayout,parent,false);
            holder= new viewfolder(convertView);
            convertView.setTag(holder);
        }
        else {
            holder=(viewfolder) convertView.getTag();
        }
        news N=getItem(position);
        holder.images.setImageResource(N.getImages());
        holder.title.setText(N.getTitle());
        holder.detail.setText(N.getDetail());
        return convertView;
    }

public class viewfolder{
    TextView detail;
    TextView title;
    ImageView images;
    viewfolder(View convertView){
        images=(ImageView)convertView.findViewById(R.id.newImage);
        detail=(TextView)convertView.findViewById(R.id.newDetail);
        title=(TextView)convertView.findViewById(R.id.newTitle);

    }



    }
}
