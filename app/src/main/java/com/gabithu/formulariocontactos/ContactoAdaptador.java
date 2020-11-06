package com.gabithu.formulariocontactos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder>{
    ArrayList<Contactos> contactos;

    public ContactoAdaptador (ArrayList<Contactos> contactos){
        this.contactos= contactos;
    }



    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto,parent,false);

        return new ContactoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder contactoViewHolder, int position) {
        Contactos contactos = Contactos.get(position);
        contactoViewHolder.imgFoto.setImageResource(contactos.getFoto());
        contactoViewHolder.tvNombreCV.setText(contactos.getNombre());
        contactoViewHolder.tvTelefonoCV.setText(contactos.getTelefono());

    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView tvTelefonoCV;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto= (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreCV= (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvTelefonoCV= (TextView) itemView.findViewById(R.id.tvTelefonoCV);
        }
    }
}
