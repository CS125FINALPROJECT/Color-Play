package edu.illinois.cs.cs125.lab12;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import edu.illinois.cs.cs125.lab12.MainActivity;

public class Main2Activity extends AppCompatActivity {
    private int redOut, greenOut, blueOut;
    private TextView inputtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        redOut = Integer.valueOf(getIntent().getStringExtra("redTr"));
        greenOut = Integer.valueOf(getIntent().getStringExtra("greenTr"));
        blueOut = Integer.valueOf(getIntent().getStringExtra("blueTr"));

        inputtext = (TextView) findViewById(R.id.NewColor);
        inputtext.setBackgroundColor(Color.rgb(redOut, greenOut, blueOut));
    }
}
        //redOut = (TextView) findViewById(R.id.RedOut);
        //redOut.setText(getIntent().getStringExtra("redTr"));

        //greenOut = (TextView) findViewById(R.id.GreenOut);
        //greenOut.setText(getIntent().getStringExtra("greenTr"));

        //blueOut = (TextView) findViewById(R.id.BlueOut);
        //blueOut.setText(getIntent().getStringExtra("blueTr"));

//        final EditText inputtext = (EditText) findViewById(R.id.newColor);
//        inputtext.addTextChangedListener(new TextWatcher() {
//
//        }
//            if (Integer.parseInt(inputtext.getText().toString()) <= 30) {
//                TextView t1 = (TextView) findViewById(R.id.textView1);
//                TextView t2 = (TextView) findViewById(R.id.textView2);
//                t1.setTextColor(Color);
//                t2.setTextColor(Color.rgb(redOut,greenOut,blueOut));
//        }

