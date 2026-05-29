package org.example.view;

import java.util.Scanner;

public class MainView {

    private final static Scanner scanner = new Scanner(System.in);

    private static final AlunoView alunoView = new AlunoView();
    private static final EquipamentoView equipamentoView = new EquipamentoView();
    private static final LocacaoView locacaoView = new LocacaoView();


    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1 -> {alunoView.menuCadastro();}
                case 2 -> {equipamentoView.menuCadastro();}
                case 3 -> {locacaoView.menuCadastro();}
                case 4 -> {locacaoView.menuListar();}
                case 5 -> {locacaoView.menuAtualizar();}
                case 6 -> {locacaoView.menuRemover();}
                case 0 -> {System.out.println("Saindo do sistema...");}
                default -> {System.out.println("Opção inválida!");}
            }

        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n====== SISTEMA DE LOCAÇÃO ======");
        System.out.println();
        System.out.println("[1] Cadastrar aluno");
        System.out.println("[2] Cadastrar equipamento");
        System.out.println("[3] Realizar locação");
        System.out.println("[4] Listar locações");
        System.out.println("[5] Atualizar dados da locação");
        System.out.println("[6] Finalizar/Remover locação");
        System.out.println("[0] Sair");

        System.out.print("\nEscolha uma opção: ");
    }

    private static int lerOpcao() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            // captura se o usuario digitar uma letra
            return -1;
        }
    }

}