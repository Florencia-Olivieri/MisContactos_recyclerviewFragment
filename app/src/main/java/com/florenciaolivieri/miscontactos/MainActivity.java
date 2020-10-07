package com.florenciaolivieri.miscontactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Creamos arraylist coleccion de contactos
    ArrayList<Contacto> contactos;
    private RecyclerView rvContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        //instanciamos
        rvContactos = (RecyclerView) findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvContactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();




    }
    public void inicializarAdaptador(){
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos, this);
        rvContactos.setAdapter(adaptador);
    }



    public void inicializarListaContactos(){
        contactos = new ArrayList<Contacto>();
        contactos.add(new Contacto(R.drawable.contactoftolollipop,"Anahí Salgado","555777999", "anahi@gmail.com"));
        contactos.add(new Contacto(R.drawable.contactoftoluna,"Lorena Martínez", "222555777", "lmartinez@gmail.com"));
        contactos.add(new Contacto(R.drawable.contactoftomushroom ,"Pedro Pérez", "777584123","pedroperez@gmail.com"));
        contactos.add(new Contacto(R.drawable.contactoftoflor,"Florencia Olivieri", "098949579","flooli7@gmail.com"));
    }
}