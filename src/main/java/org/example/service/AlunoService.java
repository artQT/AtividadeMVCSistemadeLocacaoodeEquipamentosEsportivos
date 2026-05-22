package org.example.service;

import org.example.controller.AlunoController;
import org.example.entity.Aluno;
import org.example.erros.UsuarioJaExistenteException;
import org.example.repository.AlunoRepository;

public class AlunoService {

    AlunoRepository repository = new AlunoRepository();

    public AlunoService(){}

    public void cadastrarAluno(String nome, String matricula){
        try{
            if(verificarAluno(new Aluno(nome, matricula))){
                repository.insertAluno(new Aluno(nome, matricula));
            }else{
                throw new UsuarioJaExistenteException("ERRO: Usuario já existente");
            }
        } catch (UsuarioJaExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean verificarAluno(Aluno aluno){
        if(repository.getAlunos().containsKey(aluno.getId())){
            return false;
        }
        return true;
    }
}
