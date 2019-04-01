package com.example.aluno.aula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText textNum1;
    private EditText textNum2;
    private Button buttonMais;//op 1
    private Button buttonMenos;//op 2
    private Button buttonMult;//op 3
    private Button buttonDivi;//op 4
    private Button buttonIgual;
    private TextView textOper;
    private TextView textResult;
    private int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNum1 = (EditText) findViewById(R.id.textNum1);
        textNum2 = (EditText) findViewById(R.id.textNum2);
        buttonMais = (Button) findViewById(R.id.buttonMais);
        buttonMenos = (Button) findViewById(R.id.buttonMenos);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonDivi = (Button) findViewById(R.id.buttonIgual);
        buttonIgual = (Button) findViewById(R.id.buttonIgual);
        textOper = (TextView) findViewById(R.id.textOper);
        textResult = (TextView) findViewById(R.id.textResult);

        buttonMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 1;
                textOper.setText("+");
            }
        });

        buttonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 2;
                textOper.setText("-");
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 3;
                textOper.setText("x");
            }
        });

        buttonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = 4;
                textOper.setText("/");
            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
