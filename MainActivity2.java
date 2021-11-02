package com.example.addnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {
    Intent intent;
    String TAG="MainActivity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        intent = getIntent();

        int res = Integer.parseInt(intent.getStringExtra("result"));
        Log.d(TAG, "Result is:"+res);
    }
}