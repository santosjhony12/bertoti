package Models;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Usuario extends Pessoa{
    private List<Chamado> chamados = new LinkedList<>();

    public Usuario(int idPessoa, String nomePessoa, String emailPessoa, String senhaPessoa) {
        super(idPessoa, nomePessoa, emailPessoa, senhaPessoa);
    }

    public void criarChamado(Chamado chamado){
        chamados.add(chamado);
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

}
