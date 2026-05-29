package org.example.service;

import org.example.entity.Aluno;
import org.example.entity.Equipamento;
import org.example.entity.Locacao;
import org.example.repository.LocacaoRepository;

public class LocacaoService {

    LocacaoRepository repository = new LocacaoRepository();

    public LocacaoService() {
        repository = new LocacaoRepository();
    }

    public void realizarLocacao(Aluno aluno, Equipamento equipamento, String dataLocao, String status) {
        try {
            if (validarRealizarLocacao(equipamento)){
                repository.insertLocaocao(new Locacao(aluno, equipamento, dataLocao, status));
            } else {
                throw new RuntimeException("Erro: locação invalida");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean validarRealizarLocacao(Equipamento equipamento) {
        if (!equipamento.getDisponivel() == false) return false;

        equipamento.setDisponivel(false);
        return true;
    }
}
