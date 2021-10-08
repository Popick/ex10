package com.example.ex10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    Intent gi;
    int p1,p2;
    TextView tV_p1,tV_p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gi = getIntent();
        int p1 = gi.getIntExtra("p1",1);
        int p2 = gi.getIntExtra("p2",1);
        tV_p1 = (TextView) findViewById(R.id.p1_score);
        tV_p2 = (TextView) findViewById(R.id.p2_score);

        tV_p1.setText("Blue score: "+p1);
        tV_p2.setText("Red score: "+p2);
    }

    public void back(View view) {
        setResult(RESULT_OK,gi);
        finish();
    }
}