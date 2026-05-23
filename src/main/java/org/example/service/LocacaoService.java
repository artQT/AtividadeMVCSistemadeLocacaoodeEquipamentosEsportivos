package org.example.service;

import org.example.repository.LocacaoRepository;

public class LocacaoService {

    LocacaoRepository repository = new LocacaoRepository();

    public LocacaoService(){
        repository = new LocacaoRepository();
    }

    public realizarLocacao(){
        try{
            if(validarRealizarLocacao())
        }catch(RuntimeException e){}
    }
}
