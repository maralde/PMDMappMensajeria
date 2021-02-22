package com.example.pmdmappmensajeria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NuevaConversacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_conversacion);

        final EditText nombre = findViewById(R.id.nombreAmigoNuevo);
        final EditText numero = findViewById(R.id.numeroAmigoNuevo);
        final EditText mensaje = findViewById(R.id.nuevoMensaje);

        Button boton = findViewById(R.id.Enviar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                intent.putExtra("nombre", nombre.getText().toString());
                intent.putExtra("numero", numero.getText().toString());
                intent.putExtra("mensaje", mensaje.getText().toString());

                setResult(RESULT_OK, intent);

                finish();
            }
        });
    }
}