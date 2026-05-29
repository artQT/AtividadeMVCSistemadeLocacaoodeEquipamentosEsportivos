package org.example.repository;

import org.example.entity.Aluno;
import org.example.entity.Equipamento;

import java.util.HashMap;
import java.util.Map;

public class EquipamentoRepository {

    Map<Integer, Equipamento> equipamentos;

    public EquipamentoRepository(){
        equipamentos = new HashMap<>();
    }

    public Equipamento getEquipamentoByName(String nome){
        for(Equipamento e : equipamentos.values()){
            if (e.getNome().equals(nome)) return e;
        }
        return null;
    }


    public void InsertEquipamento(Equipamento equipamento){
        equipamentos.put(equipamento.getId(), equipamento);
    }

    public Map<Integer, Equipamento> getAlunos(){
        return equipamentos;
    }
}
