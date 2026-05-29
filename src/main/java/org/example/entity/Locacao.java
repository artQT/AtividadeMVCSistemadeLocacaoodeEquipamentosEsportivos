package org.example.entity;

public class Locacao {

    private Aluno aluno;
    private Equipamento equipamento;
    private int id = 0;
    private String dataLocacao = null;
    private boolean finalizada = false;

    private static int idContador = 0;

    public Locacao(Aluno aluno, Equipamento equipamento, String dataLocacao, boolean finalizada) {
        this.id = idContador++;
        this.aluno = aluno;
        this.equipamento = equipamento;
        this.dataLocacao = dataLocacao;
        this.finalizada = finalizada;
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

    public boolean getFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
