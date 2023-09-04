package Models;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Pessoa {
    private int idPessoa;
    private String nomePessoa;
    private String emailPessoa;
    private String senhaPessoa;
    private boolean acessoADM;

    List<Chamado> chamados = new LinkedList<>();

    public Pessoa(int idPessoa, String nomePessoa, String emailPessoa, String senhaPessoa) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.emailPessoa = emailPessoa;
        this.senhaPessoa = senhaPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getSenhaPessoa() {
        return senhaPessoa;
    }

    public void setSenhaPessoa(String senhaPessoa) {
        this.senhaPessoa = senhaPessoa;
    }

    public boolean isAcessoADM() {
        return acessoADM;
    }

    public void setAcessoADM(boolean acessoADM) {
        this.acessoADM = acessoADM;
    }

    public boolean comparar(Pessoa pessoa){
        if (this.emailPessoa.equals(pessoa.getEmailPessoa()) && this.senhaPessoa.equals(pessoa.getSenhaPessoa())){
            return true;
            }else{
            return false;
        }
    }
}
