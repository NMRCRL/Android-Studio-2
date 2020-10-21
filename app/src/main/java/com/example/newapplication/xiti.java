package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class xiti extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiti);
        findViewById(R.id.jisuqi).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.jisuqi:
                Intent intent = new Intent(this, jisuqi.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }

    }
}