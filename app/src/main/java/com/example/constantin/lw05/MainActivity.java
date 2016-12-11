package com.example.constantin.lw05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.button;
import static com.example.constantin.lw05.R.id.textView3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        textView3 katya;
        button olesya;
        katya = (textView3) findViewById(textView3);
        olesya = (R.id.button) findViewById(R.id.button);
        OnClickListener obrabotka = null;
        olesya.setOnClickListener(obrabotka);
        obrabotka = new View.OnClickListener() {
            public void onClick(View) {
                katya.setText("Кнопка была нажата!");
            }
        };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
