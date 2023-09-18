import Models.Chamado;
import Models.Pessoa;
import Models.SistemaTI;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSistemaTI {
    LocalDate dataAtual = LocalDate.now();
    SistemaTI sistemaTI = new SistemaTI();
    @Test
    public void verificarInclusaodeChamadoPrioridade(){


        sistemaTI.criarChamado(new Chamado(1,"CONTA BLOQUEADA", dataAtual, "Baixa", "NEW", "Desbloquear conta SJ0204",1,1));
        sistemaTI.criarChamado(new Chamado(2,"CONTA BLOQUEADA 2", dataAtual, "Baixa", "NEW", "Desbloquear conta SJ0204",1,1));
        sistemaTI.criarChamado(new Chamado(3,"CONTA BLOQUEADA 3", dataAtual, "Alta", "NEW", "Desbloquear conta SJ0204",1,1));
        sistemaTI.criarChamado(new Chamado(4,"CONTA BLOQUEADA 4", dataAtual, "Média", "NEW", "Desbloquear conta SJ0204",1,1));

        assertEquals(sistemaTI.visualizarTodosChamados().size(), 4);
        sistemaTI.alterarPrioridadeChamado("Alta", 2);
        Chamado chamado = sistemaTI.visualizarChamadoPorCodigo(2);
        assertEquals(chamado.getPrioridade(), "Alta");

    }
    @Test
    public void login(){
        Pessoa pessoa1 = new Pessoa(1, "Jhony", "jhonysouza@dev.com", "123", true);
        Pessoa pessoa2 = new Pessoa(3, "Amanda", "amanda@dev.com", "123", false);

        sistemaTI.addPessoa(pessoa1);
        assertEquals(sistemaTI.logar(pessoa1), pessoa1);
    }
}
