package com.example.ricardo.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this,"OnCreate",Toast.LENGTH_LONG).show();

        et1 = (EditText)findViewById(R.id.txtNum1);
        et2 = (EditText)findViewById(R.id.txtNum2);
        tv1 = (TextView)findViewById(R.id.txtResultado);
    }

    public void sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int numero1 = Integer.parseInt(valor1);
        int numero2 = Integer.parseInt(valor2);

        int suma = numero1+numero2;

        String result = String.valueOf(suma);

        tv1.setText(result);

    }

    /*
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"OnStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"OnResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"OnPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"OnStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_LONG).show();
    }
    */
}
