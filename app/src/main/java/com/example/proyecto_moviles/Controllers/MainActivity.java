package com.example.proyecto_moviles.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.proyecto_moviles.R;
import com.example.proyecto_moviles.Utilidades.Utilidades;

public class MainActivity extends AppCompatActivity {

    public Button btn_registro;
    public Button btn_lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        this.btn_registro = (Button) findViewById(R.id.btn_registro);
        this.btn_lista = (Button) findViewById(R.id.btn_lista);

        this.btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(MainActivity.this,RegistroActivity.class);
                startActivity(i);


            }
        });

        this.btn_lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Utilidades();
                Intent i = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(i);
            }
        });
    }
}