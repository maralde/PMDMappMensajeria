package com.example.pmdmappmensajeria;


import android.app.AsyncNotedAppOp;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdmappmensajeria.conexion.Cliente;
import com.example.pmdmappmensajeria.conexion.ApiAmigos;
import com.example.pmdmappmensajeria.modelo.AmigosModelo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Ejercicio1 extends Fragment {
    FloatingActionButton fab;
    private Retrofit retrofit;
    private int posicionPulsada;
    private AdapterFragmentRV adapterContactos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_ejercicio1, container, false);

        RecyclerView posicionPulasada= (RecyclerView) view.findViewById(R.id.contactos);

        adapterContactos = new AdapterFragmentRV(getContext());

        posicionPulasada.setAdapter(adapterContactos);

        fab = (FloatingActionButton) view.findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NuevaConversacion.class);

                startActivity(intent);
            }
        });

        retrofit = Cliente.obtenerAmigo();

        obtenerDatos();

        return view;
    }

    private void obtenerDatos(){
        ApiAmigos api = retrofit.create(ApiAmigos.class);

        Call<ArrayList<AmigosModelo>> respuesta = api.obtenerAmigos();

        respuesta.enqueue(new Callback<ArrayList<AmigosModelo>>() {
            @Override
            public void onResponse(Call<ArrayList<AmigosModelo>> call, Response<ArrayList<AmigosModelo>> response) {
                if(response.isSuccessful()){
                    ArrayList<AmigosModelo> listaAmigos = response.body();

                    adapterContactos.anyadirALista(listaAmigos);
                }
                else{
                    Toast.makeText(getActivity(), "Fallo en la respuesta", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ArrayList<AmigosModelo>> call, Throwable t) {
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}