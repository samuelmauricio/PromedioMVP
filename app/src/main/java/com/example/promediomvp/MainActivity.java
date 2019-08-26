package com.example.promediomvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Main.Vista{

    private Main.Presentador presentador;

    private EditText nota1;
    private EditText nota2;
    private EditText nota3;
    private Button Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presentador = new ResultadoPresentador(this);

        nota1 = (EditText) findViewById(R.id.etnota1);
        nota2 = (EditText) findViewById(R.id.etnota2);
        nota3 = (EditText) findViewById(R.id.etnota3);
        Calcular = (Button) findViewById(R.id.btnCalcular);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.CalcularResultado(Double.parseDouble(nota1.getText().toString()),
                        Double.parseDouble(nota2.getText().toString()),
                        Double.parseDouble(nota3.getText().toString()));
            }
        });

    }

    @Override
    public void MostrarResultado(String r) {
        Toast.makeText(getApplicationContext(),r,Toast.LENGTH_LONG).show();
    }
}
