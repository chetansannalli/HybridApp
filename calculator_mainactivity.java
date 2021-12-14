package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    boolean isNewOp = true ;
    String op , oldNumber ;
    EditText ed1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.edv) ;

    }
    public void acEvent(View view)
    {
        ed1.setText("0");
        isNewOp=true;
    }
    public void numberEvent(View view) {
        if(isNewOp){
            ed1.setText("");
        }
        isNewOp = false;
        String number = ed1.getText().toString();
        switch (view.getId())
        {
            case R.id.seven :
                number+= "7";
                break;
            case R.id.eight :
                number+= "8";
                break;
            case R.id.nine :
                number+= "9";
                break;
            case R.id.four :
                number+= "4";
                break;
            case R.id.five:
                number+= "5";
                break;
            case R.id.six :
                number+= "6";
                break;
            case R.id.one:
                number+= "1";
                break;
            case R.id.two:
                number+= "2";
                break;
            case R.id.three :
                number+= "3";
                break;
            case R.id.zero :
                number+= "0";
                break;
            case R.id.decimal:
                number+= ".";
                break;
            case R.id.pm :
                number="-"+number;
                break;


        }
        ed1.setText(number);
    }
    public void operatorEvent(View view){

        isNewOp = true;

        oldNumber = ed1.getText().toString();
        switch(view.getId()){
            case R.id.division: op="/";
                break;
            case R.id.multiply: op="*";
                break;
            case R.id.add : op="+";
                break;
            case R.id.sub:  op="-";
                break;
        }
    }
    public void equalsEvent(View view){
        String newNumber = ed1.getText().toString();
        double result=0.0;
        switch (op)
        {
            case "+":
                result= Double.parseDouble(oldNumber)+Double.parseDouble(newNumber);
                break;
            case "-":
                result=Double.parseDouble(oldNumber)-Double.parseDouble(newNumber);
                break;
            case "*":
                result=Double.parseDouble(oldNumber)*Double.parseDouble(newNumber);
                break;
            case "/":
                result=Double.parseDouble(oldNumber)/Double.parseDouble(newNumber);
                break;
        }
        ed1.setText(result+"");
    }
    public  void percentEvent(View view){
        String n = ed1.getText().toString() ;
        double num = Double.parseDouble(n)/100;
        isNewOp = true ;
        ed1.setText(num+"");
    }


}