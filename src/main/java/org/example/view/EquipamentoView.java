package org.example.view;

import org.example.controller.EquipamentoController;

import java.util.Scanner;

public class EquipamentoView {

    private final Scanner sc;
    private final EquipamentoController equipamentoController;

    public EquipamentoView(){
        sc = new Scanner(System.in);
        equipamentoController = new EquipamentoController();
    }

    public void menuCadastro(){
        System.out.println("\n====== Menu de Cadastro de Equipamento ======");
        System.out.println();

        System.out.print("Insira o Nome do Equipamento: ");
        String nome = ViewUtils.lerLinha(sc);

        System.out.print("Insira o Tipo do Equipamento: ");
        String tipo = ViewUtils.lerLinha(sc);

        try{
            equipamentoController.cadastrarEquipamento(nome, tipo);
            System.out.println("Equipamento "+ nome +" cadastrado com sucesso!");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

}
