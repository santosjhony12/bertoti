package Models;

public class Analista extends Pessoa{
    public Analista(int idPessoa, String nomePessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomePessoa, emailPessoa, senhaPessoa);
    }

    public void alterarStatusChamado(String status, String codChamado){
        for(Chamado chamado : chamados){
            if(chamado.getCodigo().equals(codChamado)){
                chamado.setStatus(status);
            }
        }
    }


}
