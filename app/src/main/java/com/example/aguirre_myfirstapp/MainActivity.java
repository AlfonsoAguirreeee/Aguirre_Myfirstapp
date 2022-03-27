package com.example.aguirre_myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        text.setText(R.string.showTxt);

    }
}