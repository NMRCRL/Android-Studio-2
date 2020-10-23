package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kecheng extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kecheng);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button1).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, kehchengtiao.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.button1:
                 intent = new Intent(this, kechengtiao1.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }

    }
}