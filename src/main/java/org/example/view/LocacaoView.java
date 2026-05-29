package org.example.view;

import org.example.controller.LocacaoController; // não implementado ainda
import org.example.entity.Locacao;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LocacaoView {

    private final Scanner sc;
    private final LocacaoController locacaoController;

    public LocacaoView(){
        sc = new Scanner(System.in);
         locacaoController = new LocacaoController();
    }

    public void menuCadastro(){
        System.out.println("\n====== Menu de Cadastro de Locação ======");
        System.out.println();

        System.out.print("Insira o Nome do Aluno: ");
        String aluno = ViewUtils.lerLinha(sc);

        System.out.print("Insira o Nome do Equipamento: ");
        String equipamento = ViewUtils.lerLinha(sc);

        System.out.print("Insira a Data da Locação: ");
        String data = ViewUtils.lerLinha(sc);


        try{

            locacaoController.cadastrarLocacao(aluno, equipamento, data);
            System.out.println("Locação cadastrado com sucesso!");

        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuListar(){

        Locacao[] locacoes = LocacaoController.listarLocacoes;

        System.out.println("\n====== Lista de Locações ======");

        for (Locacao locacao : locacoes){
            System.out.println("\n---------------");
            System.out.println("ID: "+locacao.getId());

            System.out.println("Aluno: ");
            System.out.println("\t\tNome: "+locacao.getAluno().getNome());
            System.out.println("\t\tMatrícula: "+locacao.getAluno().getMatricula());

            System.out.println("Equipamento: ");
            System.out.println("\t\tNome: "+locacao.getEquipamento().getNome());
            System.out.println("\t\tTipo: "+locacao.getEquipamento().getTipo());

            System.out.println("Data: "+locacao.getId());
            System.out.println("Status: "+locacao.getId());
        }
        System.out.println("\n---------------");

    }

    public void menuAtualizar(){
        System.out.println("\n====== Atualiar Locação ======");
        System.out.println();

        System.out.print("Insira o ID da Locação: ");
        int id = ViewUtils.lerInt(sc);

        System.out.print("Insira o Nome do Aluno: ");
        String aluno = ViewUtils.lerLinha(sc);

        System.out.print("Insira o Nome do Equipamento: ");
        String equipamento = ViewUtils.lerLinha(sc);

        System.out.print("Insira a Data da Locação: ");
        String data = ViewUtils.lerLinha(sc);

        try {
            locacaoController.atualizarLocacao(id, aluno, equipamento, data);
            System.out.println("Locação atualizada com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void menuRemover(){
        System.out.println("\n====== Remover/Finalizar Locação ======");
        System.out.println();

        System.out.print("Insira o ID da locação: ");
        int id = ViewUtils.lerInt(sc);

        try {
            locacaoController.removerLocacao(id);
            System.out.println("Locação removida/finalizada com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
