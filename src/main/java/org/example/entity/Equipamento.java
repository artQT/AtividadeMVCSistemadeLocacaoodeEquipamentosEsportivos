package org.example.entity;

public class Equipamento {

    public int id = 0;
    public String nome = null;
    public String tipo = null;
    public boolean disponivel = true;

    public static int idContador = 0;

    public Equipamento(String nome, String tipo) {
        this.id = idContador++;
        this.nome = nome;
        this.tipo = tipo;
        this.disponivel = true;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
