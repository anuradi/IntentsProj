package com.e.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int number1 = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);
        int number2 = intent.getIntExtra(MainActivity.EXTRA_NUMBER, 0);

        TextView textView = findViewById(R.id.no_f);
        TextView textView2 = findViewById(R.id.no_s);

        textView.setText(""+number1);

        textView2.setText(""+number2);
    }
}