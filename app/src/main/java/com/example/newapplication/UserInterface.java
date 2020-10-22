package com.example.newapplication;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class UserInterface extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_interface);
        findViewById(R.id.kecheng).setOnClickListener(this);
        findViewById(R.id.zixun).setOnClickListener(this);
        findViewById(R.id.xiti).setOnClickListener(this);
        findViewById(R.id.myy).setOnClickListener(this);
        findViewById(R.id.imageView8).setOnClickListener(this);
        findViewById(R.id.imageView9).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.kecheng:
                Intent intent = new Intent(this, kecheng.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.zixun:
                intent = new Intent(this, zixun.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.xiti:
                intent = new Intent(this, xiti.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.myy:
                intent = new Intent(this, Myy.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.imageView8:
                intent = new Intent(this, zixuntiao.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.imageView9:
                intent = new Intent(this, zixuntiao1.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }

    }
}