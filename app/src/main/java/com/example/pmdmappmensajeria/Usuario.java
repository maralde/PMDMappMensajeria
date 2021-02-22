package com.example.pmdmappmensajeria;

import com.example.pmdmappmensajeria.modelo.Mensajes;

import java.util.ArrayList;

public class Usuario {

    private int id;
    private String nombre;
    private String numero;
    private ArrayList<Mensajes> mensajes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Mensajes> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensajes> mensajes) {
        this.mensajes = mensajes;
    }
}
