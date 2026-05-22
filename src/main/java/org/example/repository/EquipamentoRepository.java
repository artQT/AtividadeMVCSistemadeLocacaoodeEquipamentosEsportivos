package org.example.repository;

import org.example.entity.Equipamento;

import java.util.HashMap;
import java.util.Map;

public class EquipamentoRepository {

    Map<Integer, Equipamento> equipamentos;

    public EquipamentoRepository(){
        equipamentos = new HashMap<>();
    }

    public void IsertAluno(Equipamento equipamento){
        equipamentos.put(equipamento.getId(), equipamento);
    }

    public Map<Integer, Equipamento> getAlunos(){
        return equipamentos;
    }
}
