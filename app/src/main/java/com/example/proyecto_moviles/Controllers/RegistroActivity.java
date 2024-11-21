package com.example.proyecto_moviles.Controllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.proyecto_moviles.R;

public class RegistroActivity extends AppCompatActivity {
    private EditText text_nombre;
    private EditText text_email;
    private EditText text_edad;
    private Button btn_registrar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.registro);

        this.text_nombre = (EditText) findViewById(R.id.editTextNombre);
        this.text_email = (EditText) findViewById(R.id.editTextEmail);
        this.text_edad = (EditText) findViewById(R.id.editTextEdad);
        this.btn_registrar = (Button) findViewById(R.id.btn_registrar);

        this.btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( text_nombre.getText().toString().isEmpty() ){
                    myLongToast("El campo de nombre esta vacio");
                    return;
                }

                if (text_email.getText().toString().isEmpty() ) {
                    myLongToast("El campo de email esta vacio");
                    return;
                }

                if(text_edad.getText().toString().isEmpty()){
                    myLongToast("El campo de edad esta vacio");
                    return;
                }
                 if (Integer.parseInt(text_edad.getText().toString()) < 18) {
                    myLongToast( "Debes ser mayor de 18 años para registrarte");
                    return;
                }
                    myLongToast("Registrado con éxito");
                    finish();
                }
        });

    }

    public void myLongToast(String msg){
        Toast.makeText(RegistroActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
