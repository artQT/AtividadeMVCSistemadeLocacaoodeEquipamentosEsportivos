package org.example.repository;

import org.example.entity.Locacao;

import java.util.HashMap;
import java.util.Map;

public class LocacaoRepository {

    Map<Integer, Locacao> locacaos = new HashMap<>();

    public Locacao[] getLocacoesList(){
        return locacaos.values().toArray(new Locacao[0]);
    }

    public Map<Integer, Locacao> getLocacoes() {
        return locacaos;
    }

    public void insertLocaocao(Locacao locacao){
        locacaos.put(locacao.getId(), locacao);
    }
}
