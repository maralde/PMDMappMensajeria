package com.example.pmdmappmensajeria.conexion;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Cliente {

    private static final String URL ="http://192.168.0.22:3000";
    private static Retrofit retrofit = null;

    public static Retrofit obtenerAmigo(){
        if(retrofit == null){
            // Construimos el objeto Retrofit asociando la URL del servidor y el convertidor Gson
            // para formatear la respuesta JSON.
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
