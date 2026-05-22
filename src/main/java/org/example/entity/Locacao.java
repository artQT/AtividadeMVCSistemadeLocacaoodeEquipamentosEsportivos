package org.example.entity;

public class Locacao {

    private Aluno aluno;
    private Equipamento equipamento;
    private int id = 0;
    private String dataLocacao = null;
    private String status = null;

    private static int idContador = 0;

    public Locacao(Aluno aluno, Equipamento equipamento, String dataLocacao, String status) {
        this.id = idContador++;
        this.aluno = aluno;
        this.equipamento = equipamento;
        this.dataLocacao = dataLocacao;
        this.status = status;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
