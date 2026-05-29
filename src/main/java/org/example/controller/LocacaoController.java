package org.example.controller;

import org.example.entity.*;
import org.example.service.LocacaoService;

public class LocacaoController {


    LocacaoService locacaoService = new LocacaoService();

    public void realizarLocacao(Aluno aluno, Equipamento equipamento,String dataLocacao, String status){
        if(aluno == null){throw new IllegalArgumentException("Erro: Aluno não encontrado ");}
        if(equipamento == null){throw new IllegalArgumentException("Erro: Equipamento não encontrado");}
        if(dataLocacao.isBlank()){throw new IllegalArgumentException("Erro: Data em branco");}
        if(status.isBlank()){throw new IllegalArgumentException("Erro: Status em branco");}

        locacaoService.realizarLocacao(id, aluno, equipamento, dataLocacao, status );
    }

    public void listarLocacao(){
        locacaoService.listarLocacao();
    }

    public void atulizarLocacao( String dataLocacao, String status){

        if(dataLocacao.isBlank()){throw new IllegalArgumentException("Erro: Data invalida");}
        if(status.isBlank()){throw  new IllegalArgumentException("Erro: Status invalido");}

        locacaoService.atulizarLocacao(dataLocacao, status);
    }

    public void finalizarLocacao(long id){

        if(id <= 0){throw new IllegalArgumentException("Erro: ID invalido");}

        locacaoService.finalizarLocacao(id);

    }

    public void removerLocacao(long id){
        if(id <= 0){throw new IllegalArgumentException("Erro: ID invalido");}

        locacaoService.removerLocacao(id);
    }


}
