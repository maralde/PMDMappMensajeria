package com.example.pmdmappmensajeria.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mensajes {
    @SerializedName("texto")
    @Expose
    private String texto;
    @SerializedName("enviado")
    @Expose
    private boolean enviado;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }
}
