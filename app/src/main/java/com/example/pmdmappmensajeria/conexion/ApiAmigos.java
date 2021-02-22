package com.example.pmdmappmensajeria.conexion;

import com.example.pmdmappmensajeria.Usuario;
import com.example.pmdmappmensajeria.modelo.AmigosModelo;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiAmigos {

    @GET("amigos")
    Call<ArrayList<AmigosModelo>> obtenerAmigos();

    @POST
    Call<AmigosModelo> guardaAmigo(@Body Usuario usuario );

    @PUT("amigos/{id}")
    Call<AmigosModelo> actualizarAmigo(@Path("id") int id, @Body Cliente amigos);
}
