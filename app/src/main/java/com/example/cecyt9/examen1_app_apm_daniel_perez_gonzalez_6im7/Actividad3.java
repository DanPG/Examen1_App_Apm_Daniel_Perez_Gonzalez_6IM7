
package com.example.cecyt9.examen1_app_apm_daniel_perez_gonzalez_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad3 extends AppCompatActivity {
    TextView Traer;
    String dolares;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);

        Traer = (TextView) findViewById(R.id.Resultado);

        Bundle recibet = new Bundle();
        recibet = this.getIntent().getExtras();
        dolares = recibet.getString("Dolares");
        Traer.setText("Daniel Perez Gonzalez, Resultado:\n" + dolares + "\n");
    }

    public void enviar(View correo){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Exmaen");
        intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo:\n"+Traer+"\n");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "eoropezag@ipn.mx"} );
        startActivity(intent);
    }


}
