package com.example.parcial1froilancanuluc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Dame1, Dame2;
    Button sum, res, mul, div;
    TextView RESULtado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dame1 = (EditText) findViewById(R.id.Dame11);
        Dame2 = (EditText) findViewById(R.id.Dame22);
        RESULtado = (TextView) findViewById(R.id.resu1);
        sum = (Button) findViewById(R.id.sum1);
        sum.setOnClickListener(this);
        res = (Button) findViewById(R.id.res2);
        res.setOnClickListener(this);
        mul = (Button) findViewById(R.id.mul3);
        mul.setOnClickListener(this);
        div = (Button) findViewById(R.id.div4);
        div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int Dame11 = Integer.parseInt(Dame1.getText().toString());
        int Dame22 = Integer.parseInt(Dame2.getText().toString());
        int resu1 = 0;

        switch (v.getId()){
            case R.id.sum1:
                resu1=Dame11+Dame22;
                break;
                case R.id.res2:
                    resu1=Dame11-Dame22;
                    break;
            case R.id.mul3:
                resu1=Dame11*Dame22;
                break;
            case R.id.div4:
                resu1=Dame11/Dame22;
                break;
        }
        RESULtado.setText(""+resu1);
    }
}