package org.example.controller;

import org.example.entity.*;
import org.example.service.LocacaoService;
//varios erros aqui:

public class LocacaoController {


    LocacaoService locacaoService = new LocacaoService();

    public void cadastrarLocacao(Aluno aluno, Equipamento equipamento,String dataLocacao, boolean finalizada){
        if(aluno == null){throw new IllegalArgumentException("Erro: Aluno não encontrado ");}
        if(equipamento == null){throw new IllegalArgumentException("Erro: Equipamento não encontrado");}
        if(dataLocacao.isBlank()){throw new IllegalArgumentException("Erro: Data em branco");}

        locacaoService.realizarLocacao(aluno, equipamento, dataLocacao, finalizada);
    }

    public Locacao[] listarLocacoes(){
        return locacaoService.listarLocacao();
    }

    public void atualizarLocacao(int id,Aluno aluno, Equipamento equipamento, String dataLocacao){

        if(dataLocacao.isBlank()){throw new IllegalArgumentException("Erro: Data invalida");}

        locacaoService.atualizarLocacao(id, aluno, equipamento, dataLocacao);
    }

    public void finalizarLocacao(int id){

        if(id <= 0){throw new IllegalArgumentException("Erro: ID invalido");}

        locacaoService.finalizarLocacao(id);

    }

    public void removerLocacao(int id){
        if(id <= 0){throw new IllegalArgumentException("Erro: ID invalido");}

        locacaoService.removerLocacao(id);
    }
}
