package com.example.ricardo.notasestudiante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txtMatematicas);
        et2 = (EditText)findViewById(R.id.txtFisica);
        et3 = (EditText)findViewById(R.id.txtQuimica);
        tv1 = (TextView)findViewById(R.id.tvStatus);
    }

    public void estatus(View view){
        String matematicas = et1.getText().toString();
        String fisica = et1.getText().toString();
        String quimica = et3.getText().toString();

        int mat = Integer.parseInt(matematicas);
        int fis = Integer.parseInt(fisica);
        int qui = Integer.parseInt(quimica);

        int promedio = (mat + fis + qui) / 3;

        if(promedio >=6){
            tv1.setText("Estado aprobado con "+ promedio);
        }else if(promedio <=5){
            tv1.setText("Estatus reprobado con "+ promedio);
        }

    }
}
