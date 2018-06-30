package com.example.logintest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class FruitAdapter extends ArrayAdapter<Fruit>{
    private int resourceId;
    public FruitAdapter(Context contex,int textViewResourceId, List<Fruit> objects){
        super(contex,textViewResourceId,objects);
        resourceId=textViewResourceId;


    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Fruit fruit=getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView fruitImage=(ImageView)view.findViewById(R.id.fruit_image);
        TextView fruit_name=(TextView)view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruit_name.setText(fruit.getName());
        return view;


    }

}
