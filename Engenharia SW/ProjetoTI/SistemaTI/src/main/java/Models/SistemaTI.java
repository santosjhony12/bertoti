package Models;

import java.util.LinkedList;
import java.util.List;

public class SistemaTI {
    private List<Pessoa> pessoas = new LinkedList<>();

    public Pessoa logar(Pessoa pessoa){
        for (Pessoa pessoaLista : pessoas){
            if(pessoaLista.comparar(pessoa)){
                return pessoaLista;
            }
        }
        return null;
    }
}
