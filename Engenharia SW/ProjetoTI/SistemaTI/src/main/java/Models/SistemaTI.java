package Models;

import java.util.LinkedList;
import java.util.List;

public class SistemaTI {
    private List<Pessoa> pessoas = new LinkedList<>();
    private List<Chamado> chamados = new LinkedList<>();

    public Pessoa logar(Pessoa pessoa){
        for (Pessoa pessoaLista : pessoas){
            if(pessoaLista.comparar(pessoa)){
                return pessoaLista;
            }
        }
        return null;
    }

    public void criarChamado(Chamado chamado){
        chamados.add(chamado);
    }
    public Chamado visualizarChamadoPorCodigo(String codigoChamaodo){
        Chamado chamadoEncontrado = null;
        for(Chamado chamado : chamados){
            if (chamado.getCodigo().equals(codigoChamaodo)){
                chamadoEncontrado = chamado;
            }
        }
        return chamadoEncontrado;
    }
    public List<Chamado> visualizarChamadosPorStatus(String status, int idPessoa){
        List<Chamado> chamadosEncontrados = new LinkedList<>();

        for (Chamado chamado : chamados){
            if(chamado.getCodCriador() == idPessoa && chamado.getStatus().equals(status)) {
                chamadosEncontrados.add(chamado);
            }
        }
        return chamadosEncontrados;
    }
    public List<Chamado> visualizarTodosChamados(){
        return chamados;
    }
    public List<Chamado> visualizarChamadosPorIdUsuario(int idusuario){
        List<Chamado> chamadosEncontrados = new LinkedList<>();
        for(Chamado chamado : chamados){
            if(chamado.getCodCriador() == idusuario){
                chamadosEncontrados.add(chamado);
            }
        }
        return chamadosEncontrados;
    }
    public void alterarStatusChamado(String status, String codChamado){
        for(Chamado chamado : chamados){
            if(chamado.getCodigo().equals(codChamado)){
                chamado.setStatus(status);
            }
        }
    }
    public void alterarPrioridadeChamado(String prioridade, String codigoChamado){
        for(Chamado chamado : chamados){
            if(chamado.getCodigo().equals(codigoChamado)){
                chamado.setPrioridade(prioridade);
            }
        }
    }
}
