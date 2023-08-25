package org.example.Model;
import java.util.LinkedList;
import java.util.List;

public class SalaAula {
    private List<Aluno> listaChamada;

    public List<Aluno> buscarAlunoNome(String nome){
        List<Aluno> alunosEncontrados = new LinkedList<Aluno>();
        for (Aluno aluno: listaChamada){
            if(aluno.getNome().equals(nome)) {
                alunosEncontrados.add(aluno);
            }
        }
        return alunosEncontrados;
    }
}
