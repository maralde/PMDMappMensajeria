package com.example.pmdmappmensajeria.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mensajes {
    @SerializedName("enviados")
    @Expose
    private String enviados;
    @SerializedName("recibidos")
    @Expose
    private String recibidos;

    public String getEnviados() {
        return enviados;
    }

    public void setEnviados(String enviados) {
        this.enviados = enviados;
    }

    public String getRecibidos() {
        return recibidos;
    }

    public void setRecibidos(String recibidos) {
        this.recibidos = recibidos;
    }
}
