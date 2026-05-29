package org.example.controller;

import org.example.entity.Aluno;
import org.example.service.AlunoService;

public class AlunoController {

    private AlunoService alunoService = new AlunoService();

    public void cadastrarAluno(String nome, String matricula) throws IllegalArgumentException{
        if (nome.isBlank()) {throw new IllegalArgumentException("Erro: nome em branco");}
        if (nome.length()< 3) {throw new IllegalArgumentException("Erro nome invalido");}
        if (matricula.isBlank()){throw new IllegalArgumentException("Erro: matricula em branco");}
        if (!matricula.matches("[a-zA-Z0-9]+")){throw new IllegalArgumentException("Erro: matricula invalidas");}

        alunoService.cadastrarAluno(nome, matricula);

    }
}
