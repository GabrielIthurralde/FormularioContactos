package com.gabithu.formulariocontactos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Object Contactos;
    ArrayList<Contactos>
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contactos = new ArrayList<Contactos>();

        Contactos.add(new Contactos("Gabriel Ithurralde", "02/05/2020", "098989204", "gabrielithurralde@gmail.com", "comentario"));
        Contactos.add(new Contactos("Sebastian Masullo", "02/05/2020", "22012051", "sebastianmasullo@gmail.com", "comentario"));

        ArrayList<String> nombresContacto = new ArrayList<>();
        for (Contactos contactos : Contactos) {
        nombresContacto.add(contactos.getNombre());

    }



        ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent= new Intent(MainActivity.this, ConfirmacionDeDatos.class);
                intent.putExtra(getResources().getString(R.string.pnombre), Contactos.get(position).getNombre());
                intent.putExtra(getResources().getString(R.string.pfechadenacimiento), Contactos.get(position).getFechanacimiento());
                intent.putExtra(getResources().getString(R.string.ptelefono), Contactos.get(position).getTelefono());
                intent.putExtra(getResources().getString(R.string.pemail), Contactos.get(position).getEmail());
                intent.putExtra(getResources().getString(R.string.pdescripcioncomentario), Contactos.get(position).getDescripcionComentario());

                startActivity(intent);
            }
        });

    }
}