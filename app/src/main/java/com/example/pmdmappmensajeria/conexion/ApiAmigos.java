package com.example.pmdmappmensajeria.conexion;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiAmigos {

    @GET("amigos")
    Call<ArrayList<Amigos>> obtenerAmigos();

    @FormUrlEncoded
    @POST
    Call<Amigos> guardaAmigo(
        @Field("nombre") String nombre,
        @Field("numero") int numero,
        @Field("mensajes/{enviados}") String mensaje
        );
    @PUT("amgios/{id}")
    Call<Amigos> actualizarAmigo(@Path("id") int id, @Body Amigos amigos);
}
