package com.example.proyecto_moviles.Adapters;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto_moviles.Controllers.VistaDetalleActivity;
import com.example.proyecto_moviles.Models.Animal;
import com.example.proyecto_moviles.R;
import com.example.proyecto_moviles.Utilidades.Utilidades;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    List<Animal> listAnimales;
    private AppCompatActivity activity;
    private androidx.appcompat.view.ActionMode mActionMode;
    private  int posicion_actual;


    public RecyclerAdapter(List<Animal> listAnimales, AppCompatActivity activity) {
        this.listAnimales = listAnimales;
        this.activity = activity;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_list,parent, false);
        return new RecyclerHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder,int position) {

            Animal a =  this.listAnimales.get(position);
            holder.txtViewDesc.setText(a.getDescripcion());
            holder.imgAnimal.setImageResource(a.getImagenId());
            holder.txtViewNombre.setText(a.getNombre());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(activity, VistaDetalleActivity.class);
                i.putExtra(Utilidades.IMAGEN,a.getImagenId());
                i.putExtra(Utilidades.NOMBRE,a.getNombre());
                i.putExtra(Utilidades.DESC,a.getDescripcion());
                activity.startActivity(i);


            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                if (mActionMode == null) {

                     posicion_actual = holder.getAdapterPosition();

                    if (posicion_actual != RecyclerView.NO_POSITION) {
                        mActionMode = activity.startSupportActionMode(mActionCallback);
                    }else{
                        return false;
                    }
                }
                return true;

            }
        });
    }

    @Override
    public int getItemCount() {
        return this.listAnimales.size();
    }


    public class RecyclerHolder extends RecyclerView.ViewHolder {
         private ImageView imgAnimal;
        private TextView txtViewNombre;
        private TextView  txtViewDesc;


        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            imgAnimal  = (ImageView) itemView.findViewById(R.id.image_animal);
            txtViewNombre = (TextView)  itemView.findViewById(R.id.text_nombre);
            txtViewDesc  = (TextView)  itemView.findViewById(R.id.text_descripcion);


        }
    }




    public AlertDialog createAlertdialog (String titulo , String mensaje){

        AlertDialog.Builder builder = new AlertDialog.Builder(this.activity);

        builder.setTitle(titulo);
        builder.setMessage(mensaje);

        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listAnimales.remove(posicion_actual);
                notifyItemRemoved(posicion_actual);
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               Toast toast = Toast.makeText(activity,"Accion Cancelada",Toast.LENGTH_SHORT);
               toast.show();

            }
        });

        return builder.create();
    }


    private final androidx.appcompat.view.ActionMode.Callback mActionCallback = new androidx.appcompat.view.ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.action_menu, menu);
            actionMode.setTitle("Animalia");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode actionMode, MenuItem item) {
            if (item.getItemId() == R.id.borrar) {
                AlertDialog alertDialog = createAlertdialog("Confirmar eliminación", "¿Estás seguro que quieres borrar un elemento de la lista?");
                alertDialog.show();
                actionMode.finish();
                return true;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode actionMode) {
            mActionMode = null;
        }
    };

}

