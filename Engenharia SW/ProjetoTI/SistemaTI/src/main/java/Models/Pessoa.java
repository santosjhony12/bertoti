package Models;

import java.util.LinkedList;
import java.util.List;

public class Pessoa {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private boolean acessoADM;

    List<Chamado> chamados = new LinkedList<>();

    public Pessoa(int id, String nome, String email, String senha, boolean acessoADM) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.acessoADM = acessoADM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAcessoADM() {
        return acessoADM;
    }

    public void setAcessoADM(boolean acessoADM) {
        this.acessoADM = acessoADM;
    }

    public boolean comparar(Pessoa pessoa){
        if (this.email.equals(pessoa.getEmail()) && this.senha.equals(pessoa.getSenha())){
            return true;
            }else{
            return false;
        }
    }
}
