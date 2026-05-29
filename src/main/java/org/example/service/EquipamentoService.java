package org.example.service;

import org.example.entity.Equipamento;
import org.example.repository.EquipamentoRepository;

public class EquipamentoService {

    EquipamentoRepository repository = new EquipamentoRepository();

    public EquipamentoService(){
        repository = new EquipamentoRepository();
    }

    public void cadastrarEquipamento(String nome,String tipo) {
        try{
            if(validarEquipamento(new Equipamento(nome,tipo))) {
                repository.InsertEquipamento(new Equipamento(nome,tipo));
            }else{
                throw new RuntimeException("Erro: equipamento invalido");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean validarEquipamento(Equipamento equipamento){

        return true;
    }
}
