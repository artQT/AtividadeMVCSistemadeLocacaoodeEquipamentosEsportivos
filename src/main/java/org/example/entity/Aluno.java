package org.example.entity;

public class Aluno {

    private int id = 0;
    private String nome = null;
    private String matricula = null;

    private static int idContador = 0;

    public Aluno(String nome, String matricula){
        this.id = idContador++;
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
