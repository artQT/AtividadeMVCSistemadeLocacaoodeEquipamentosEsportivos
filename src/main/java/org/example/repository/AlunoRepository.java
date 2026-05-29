package org.example.repository;

import org.example.entity.Aluno;

import java.util.HashMap;
import java.util.Map;

public class AlunoRepository {

    Map<Integer, Aluno> alunos = new HashMap<>();

    public Map<Integer, Aluno> getAlunos(){
        return alunos;
    }

    public Aluno getAlunoByName(String nome){
        for(Aluno a : alunos.values()){
            if (a.getNome().equals(nome)) return a;
        }
        return null;
    }

    public void insertAluno(Aluno aluno){
       alunos.put(aluno.getId(), aluno);
    }
}
