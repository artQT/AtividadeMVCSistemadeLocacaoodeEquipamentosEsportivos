package org.example.view;

//import org.example.controller.LocacaoController; // não implementado ainda

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class LocacaoView {

    private final Scanner sc;
//    private final LocacaoController locacaoController;

    public LocacaoView(){
        sc = new Scanner(System.in);
        // locacaoController = new LocacaoController();
    }

    public void menuCadastro(){
        System.out.println("====== Menu de Cadastro de Locação ======");
        System.out.println();

        System.out.print("Insira o Nome do Aluno: ");
        String aluno = ViewUtils.lerLinha(sc);

        System.out.print("Insira o Nome do Equipamento: ");
        String equipamento = ViewUtils.lerLinha(sc);

        System.out.print("Insira a Data da Locação: ");
        String data = ViewUtils.lerLinha(sc);


        try{

            // locacaoController.cadastrarLocacao(aluno, equipamento, data);
            System.out.println("Locação cadastrado com sucesso!");

        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
