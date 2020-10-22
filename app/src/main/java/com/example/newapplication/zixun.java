package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class zixun extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zixun);
        findViewById(R.id.imageView).setOnClickListener(this);
        findViewById(R.id.imageView1).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView:
                Intent intent = new Intent(this, zixuntiao.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.imageView1:
                 intent = new Intent(this, zixuntiao1.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }

    }
}