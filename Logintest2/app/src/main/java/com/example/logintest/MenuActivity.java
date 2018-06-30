package com.example.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button buttonfind1=(Button)findViewById(R.id.find1);

        Button buttons1=(Button)findViewById(R.id.sure1);
        Button buttons2=(Button)findViewById(R.id.sure2);
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MenuActivity.this,ListActivity.class);
                startActivity(intent);

            }
        });
        buttons1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MenuActivity.this, "挂失成功", Toast.LENGTH_SHORT).show();
            }
        });
        EditText tv1=(EditText)findViewById(R.id.et);
        String lost=tv1.getText().toString();
        String [] numberlost={"2017141463139","2017141463138","2017141463136"};
        int a=0;
        for(int i=0;i<2;i++){
            if(lost==numberlost[i]) {
                a=1;
            }
        }
        if(a==0){
        buttons2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(MenuActivity.this, "尚未有人找到", Toast.LENGTH_SHORT).show();

            }
        });}
        else if(a==1){
            buttons2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MenuActivity.this, "已经有人找到", Toast.LENGTH_SHORT).show();
                }
            });
        }
        buttonfind1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MenuActivity.this,fabuActivity.class);
                startActivity(intent);
            }
        });


    }
}
