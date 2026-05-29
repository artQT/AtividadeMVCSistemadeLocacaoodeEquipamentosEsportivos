package org.example.controller;

import org.example.entity.*;
import org.example.service.LocacaoService;
import org.example.repository.*;

public class LocacaoController {


    static LocacaoService locacaoService = new LocacaoService();

    public void cadastrarLocacao(Aluno aluno, Equipamento equipamento,String dataLocacao, boolean finalizada){
        if(aluno == null){throw new IllegalArgumentException("Erro: Aluno não encontrado ");}
        if(equipamento == null){throw new IllegalArgumentException("Erro: Equipamento não encontrado");}
        if(dataLocacao.isBlank()){throw new IllegalArgumentException("Erro: Data em branco");}

        locacaoService.realizarLocacao(aluno, equipamento, dataLocacao, finalizada);
    }

    public static Locacao[] listarLocacoes(){
        return locacaoService.listarLocacoes();
    }

    public void atualizarLocacao(int id,String nome_aluno, String nome_equipamento, String dataLocacao){

        if(dataLocacao.isBlank()){throw new IllegalArgumentException("Erro: Data invalida");}

        AlunoRepository alunoRepo = new AlunoRepository();
        EquipamentoRepository equipRepo = new EquipamentoRepository();

        Aluno aluno = alunoRepo.getAlunoByName(nome_aluno);
        Equipamento equipamento = equipRepo.getEquipamentoByName(nome_equipamento);

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
