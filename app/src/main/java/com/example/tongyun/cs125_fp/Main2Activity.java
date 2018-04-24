package com.example.tongyun.cs125_fp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView redOut, greenOut, blueOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        redOut = (TextView) findViewById(R.id.RedOut);
        redOut.setText(getIntent().getStringExtra("redTr"));

        greenOut = (TextView) findViewById(R.id.GreenOut);
        greenOut.setText(getIntent().getStringExtra("greenTr"));

        blueOut = (TextView) findViewById(R.id.BlueOut);
        blueOut.setText(getIntent().getStringExtra("blueTr"));
    }

}
