package org.example.controller;

import org.example.service.EquipamentoService;

public class EquipamentoController {

    private EquipamentoService equipamentoService = new EquipamentoService();

    public void cadastrarEqupamento(String nome, String tipo){
        if(nome.isBlank()){throw new RuntimeException("Erro: nome em branco");}
        if(nome.length()< 3){throw new RuntimeException("Erro: nome invalido");}
        if(tipo.isBlank()){throw new RuntimeException(("Erro: tipo em branco"));}
        if(tipo.matches("[a-zA-Z ]+"))throw new RuntimeException("Erro:ipo invalido");

        equipamentoService.cadastrarEquipamento(nome,tipo);
    }
}
