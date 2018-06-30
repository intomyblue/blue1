package com.example.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_list);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(ListActivity.this,R.layout.fruit_item,fruitList);
        ListView listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                String a=fruit.getName();
                switch (a){
                    case "<6月1号>在二餐捡到鸭舌帽一顶":
                        Intent intent=new Intent(ListActivity.this,Reply1.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
    }
    private void initFruits(){
        Fruit l1 =new Fruit("<6月1号>在二餐捡到鸭舌帽一顶",R.drawable.find);
        fruitList.add(l1);
        Fruit l2 =new Fruit("<5月30号>在图书馆拾到钱包一个",R.drawable.find);
        fruitList.add(l2);
        Fruit l3 =new Fruit("<6月2号>在一教丢失红色书包一个",R.drawable.find);
        fruitList.add(l3);
        Fruit l4 =new Fruit("<6月1号>在长桥捡到黑色太阳伞一把",R.drawable.find);
        fruitList.add(l4);
        Fruit l5 =new Fruit("<6月1号>在一餐捡到黑色钱包一个 ",R.drawable.find);
        fruitList.add(l5);
    }
}

