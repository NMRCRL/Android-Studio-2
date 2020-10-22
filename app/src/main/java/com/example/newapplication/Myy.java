package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Myy extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myy);
        findViewById(R.id.nodeng).setOnClickListener(this);
        findViewById(R.id.wodekecheng).setOnClickListener(this);
        findViewById(R.id.wodezixun).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.nodeng:
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.wodekecheng:
                 intent = new Intent(this, kecheng.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.wodezixun:
                 intent = new Intent(this, zixun.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }


    }
}