package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {
    private EditText etUsername2;

    private CheckBox cbJavaLogin;
    private CheckBox cbAndroidLogin;
    private CheckBox cbDbLogin;
    private Button btnOkLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        etUsername2 = findViewById(R.id.et_username);
        cbJavaLogin = findViewById(R.id.cb_java_login);
        cbAndroidLogin = findViewById(R.id.cb_android_login);
        cbDbLogin = findViewById(R.id.cb_db_login);
        btnOkLogin = findViewById(R.id.cb_ok_login);
        //3.设置按钮的监听器
        btnOkLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }



    protected void login(){
        String username = etUsername2.getText().toString().trim();

        if(TextUtils.isEmpty(username) ){
            Toast.makeText(this,"用户名输入错误",Toast.LENGTH_LONG).show();
            return;
        }
        if("user1".equals(username) ){
            Toast.makeText(this,"成功进入",Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this,LoginActivity.class);
            intent.putExtra("username",username);
            startActivity(intent);
        }else{
            Toast.makeText(this,"用户名输入错误",Toast.LENGTH_LONG).show();
        }

    }
}