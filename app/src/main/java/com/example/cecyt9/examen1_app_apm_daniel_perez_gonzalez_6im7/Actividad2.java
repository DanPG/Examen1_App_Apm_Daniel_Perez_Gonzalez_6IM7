package com.example.cecyt9.examen1_app_apm_daniel_perez_gonzalez_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {
    EditText Peso;
    Button coonvertir;
    TextView Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
    }

    public void  Convertir(View v){
        String Dolar, valor;
        int peso;
        Double  total;
        Peso = (EditText) findViewById(R.id.Pesos);
        valor = Peso.getText().toString();
        peso = Integer.parseInt(valor);
        total =(double) peso / 15;


        Intent envia = new Intent(this, Actividad3.class);
        Bundle datos = new Bundle();
        datos.putString("Dolares", String.valueOf(total));
        envia.putExtras(datos);
        finish();
        startActivity(envia);

    }
}
