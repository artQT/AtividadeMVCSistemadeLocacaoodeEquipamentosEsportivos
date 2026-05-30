package org.example.controller;

import org.example.service.EquipamentoService;

public class EquipamentoController {

    private EquipamentoService equipamentoService = new EquipamentoService();

    public void cadastrarEquipamento(String nome, String tipo){

        if(nome.isBlank()){
          throw new IllegalArgumentException("Erro: nome em branco");
        }
        if(nome.length()< 3){
          throw new IllegalArgumentException("Erro: nome invalido");
        }
        if(tipo.isBlank()){
          throw new IllegalArgumentException(("Erro: tipo em branco"));
        }
        if(!tipo.matches("[a-zA-Z ]+")){
          throw new IllegalArgumentException("Erro:ipo invalido");
        }
    equipamentoService.cadastrarEquipamento(nome, tipo);
    }
}