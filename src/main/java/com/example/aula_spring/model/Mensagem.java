package com.example.aula_spring.model;

public class Mensagem {
    private String texto;
    private String autora;

    public Mensagem() { }  // construtor vazio, pro Jackson

    public Mensagem(String texto, String autora) {
        this.texto = texto;
        this.autora = autora;
    }

    public String getTexto() { return texto; }
    public String getAutora() { return autora; }
}
