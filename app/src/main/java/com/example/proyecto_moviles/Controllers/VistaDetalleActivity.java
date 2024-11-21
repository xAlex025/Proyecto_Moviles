package com.example.proyecto_moviles.Controllers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proyecto_moviles.R;
import com.example.proyecto_moviles.Utilidades.Utilidades;

public class VistaDetalleActivity extends AppCompatActivity {

    private ImageView imagen_animal;
    private TextView text_nombre;
    private TextView text_descripcion;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.vista_detalle);


        this.imagen_animal = findViewById(R.id.image_animal_detalle);
        this.text_nombre = findViewById(R.id.text_nombre_detalle);
        this.text_descripcion = findViewById(R.id.text_descripcion_detalle);

        Intent i = getIntent();

        this.imagen_animal.setImageResource(i.getIntExtra(Utilidades.IMAGEN,0));
        this.text_nombre.setText(i.getStringExtra(Utilidades.NOMBRE));
        this.text_descripcion.setText(i.getStringExtra(Utilidades.DESC));



    }
}
