package org.example.view;

import org.example.controller.AlunoController;
import org.example.erros.*;

import java.util.Scanner;

public class AlunoView {

    private final Scanner sc;
    private final AlunoController alunoController;

    public AlunoView(){
        sc = new Scanner(System.in);
        alunoController = new AlunoController();
    }

    public void menuCadastro(){
        System.out.println("\n====== Menu de Cadastro de Aluno ======");
        System.out.println();

        System.out.print("Insira o Nome do Aluno: ");
        String nome = ViewUtils.lerLinha(sc);

        System.out.print("Insira a Matrícula do Aluno: ");
        String matricula = ViewUtils.lerLinha(sc);

        try{

            alunoController.cadastrarAluno(nome, matricula);
            System.out.println("Aluno "+nome+" cadastrado com sucesso!");

        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
