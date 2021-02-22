package com.example.pmdmappmensajeria;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdmappmensajeria.modelo.AmigosModelo;

import java.util.ArrayList;

public class AdapterFragmentRV extends RecyclerView.Adapter<AdapterFragmentRV.MiViewHolder>{

    private ArrayList<AmigosModelo> lista;
    public static Context contexto;

    public AdapterFragmentRV(Context contexto) {
        this.contexto = contexto;
        this.lista = new ArrayList<AmigosModelo>();
    }


    public static class MiViewHolder extends RecyclerView.ViewHolder {
        public static TextView nombreAmigoTV;
        public static TextView numeroAmigoTV;

        @RequiresApi(api = Build.VERSION_CODES.M)
        public MiViewHolder(View view) {
            super(view);

            this.nombreAmigoTV = itemView.findViewById(R.id.NombreAmigo);
            this.numeroAmigoTV = itemView.findViewById(R.id.numeroAmigo);

            SharedPreferences prefe = PreferenceManager.getDefaultSharedPreferences(AdapterFragmentRV.contexto);

        }
    }

    public void anyadirALista(ArrayList<AmigosModelo> lista){
        lista.addAll(lista);
        notifyDataSetChanged();
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @NonNull
    @Override
    public AdapterFragmentRV.MiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        View view = inflater.inflate(R.layout.activity_ejercicio1, viewGroup, false);

        AdapterFragmentRV.MiViewHolder miViewHolder = new AdapterFragmentRV.MiViewHolder(view);

        return miViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFragmentRV.MiViewHolder holder, int position) {

        final String nombreAmigo = lista.get(position).getNombre();
        final String numeroAmigo = lista.get(position).getNumero();

        holder.nombreAmigoTV.setText(nombreAmigo);
        holder.numeroAmigoTV.setText(numeroAmigo);

    }

    @Override
    public int getItemCount() {
        if (lista == null)
            return 0;
        else
            return lista.size();
    }

}