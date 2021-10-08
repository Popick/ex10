package com.example.ex10;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener,View.OnClickListener{

    int p1,p2;
    Button long_press, short_press, result;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1=0;p2=0;
        short_press = (Button) findViewById(R.id.short_press);
        long_press = (Button) findViewById(R.id.long_press);
        result = (Button) findViewById(R.id.result);

        long_press.setOnLongClickListener(this);
        short_press.setOnClickListener(this);

        si = new Intent(this,MainActivity2.class);

    }

    public void gotoresult(View view) {
        si.putExtra("p1",p1);
        si.putExtra("p2",p2);
        startActivityForResult(si,1);

    }

    @Override
    public void onClick(View v) {
        p1++;
    }

    @Override
    public boolean onLongClick(View v) {
        p2=p2+2;
        return false;
    }

    @Override
    protected void onActivityResult(int source, int good, @Nullable Intent data_back) {
        if (data_back != null) {
            p1 = 0;
            p2 = 0;
        }
    }
    }