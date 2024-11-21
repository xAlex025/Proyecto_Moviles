package com.example.proyecto_moviles.Controllers;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto_moviles.Adapters.RecyclerAdapter;
import com.example.proyecto_moviles.R;
import com.example.proyecto_moviles.Utilidades.Utilidades;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.recycler_view);

        this.recyclerView = findViewById(R.id.recyclerView);


        this.recyclerView.setAdapter(new RecyclerAdapter(Utilidades.getAnimales(),this));
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        this.recyclerView.setLayoutManager(layoutManager);

    }
}
