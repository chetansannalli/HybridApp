package com.example.addnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    Button add;
    TextView res;
    String TAG="MainActivity";
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this,MainActivity2.class);

       num1=findViewById(R.id.num1);
       num2=findViewById(R.id.num2);
       add=findViewById(R.id.btn);
       res=findViewById(R.id.ans);

       add.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {

               int n1 = Integer.parseInt(num1.getText().toString());
               int n2 = Integer.parseInt(num2.getText().toString());

               int sum = n1 + n2;

               res.setText("answer:"+sum);

               //Toast.makeText(getApplicationContext(),"adding two numbers");
               Log.d(TAG,"we are adding two numbers");
               intent.putExtra("result",sum+"");
               startActivity(intent);
           }
       });
    }


}