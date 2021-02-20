package com.example.pmdmappmensajeria;

public class Chat {
    private String enviado;
    private String recibido;

    public Chat(String enviado, String recibido){
        this.enviado = enviado;
        this.recibido = enviado;
    }

    public String getEnviado() {
        return enviado;
    }

    public String getRecibido() {
        return recibido;
    }
}
