package org.example.service;

import org.example.entity.Aluno;
import org.example.entity.Equipamento;
import org.example.entity.Locacao;
import org.example.repository.LocacaoRepository;

public class LocacaoService {

    LocacaoRepository repository;

    public LocacaoService() {
        repository = new LocacaoRepository();
    }

    public void realizarLocacao(Aluno aluno, Equipamento equipamento, String dataLocao, boolean finalizada) {
        try {
            if (validarRealizarLocacao(equipamento)){
                repository.insertLocaocao(new Locacao(aluno, equipamento, dataLocao, finalizada));
            } else {
                throw new RuntimeException("Erro: locação invalida");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public Locacao[] listarLocacoes(){
        return repository.getLocacoesList();
    }

    public void atualizarLocacao(int id, Aluno novoAluno, Equipamento novoEquipamento, String novaDataLocacao){

        repository.getLocacoes().get(id).setAluno(novoAluno);
        repository.getLocacoes().get(id).setEquipamento(novoEquipamento);
        repository.getLocacoes().get(id).setDataLocacao(novaDataLocacao);

    }

    public void finalizarLocacao(int id){
        repository.getLocacoes().get(id).setFinalizada(false);
    }

    public void removerLocacao(int id){
        repository.getLocacoes().remove(id);
    }


    public boolean validarRealizarLocacao(Equipamento equipamento) {
        if (!!equipamento.getDisponivel()) return false;

        equipamento.setDisponivel(false);
        return true;
    }
}
