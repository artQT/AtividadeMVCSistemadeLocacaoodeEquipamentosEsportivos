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
            }else{

            }
        } catch (RuntimeException e) {

        }
    }

    public boolean validarEquipamento(Equipamento equipamento){


        return true;
    }
}
