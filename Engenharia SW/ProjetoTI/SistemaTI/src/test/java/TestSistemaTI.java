import Models.Chamado;
import Models.Pessoa;
import Models.SistemaTI;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestSistemaTI {
    private SistemaTI sistemaTI = new SistemaTI();

    @Test
    public void testLogarComSucesso() {
        Pessoa pessoa = new Pessoa(1, "usuario1", "usuario1@example.com", "senha123", false);
        sistemaTI.addPessoa(pessoa);

        Pessoa resultado = sistemaTI.logar(pessoa);

        assertNotNull(resultado);
    }

    @Test
    public void testLogarComFalha() {
        Pessoa pessoa = new Pessoa(1, "usuario1", "usuario1@example.com", "senha123", false);
        sistemaTI.addPessoa(pessoa);

        Pessoa pessoaInvalida = new Pessoa(2, "usuario2", "usuario2@example.com", "senha456", false);

        Pessoa resultado = sistemaTI.logar(pessoaInvalida);

        assertNull(resultado);
    }

    @Test
    public void testCriarChamadoComSucesso() {
        Chamado chamado = new Chamado(1, "Título", LocalDate.now(), "Alta", "Aberto", "Descrição", 1, 2);

        sistemaTI.criarChamado(chamado);

        List<Chamado> chamados = sistemaTI.visualizarTodosChamados();
        assertTrue(chamados.contains(chamado));
    }
    @Test
    public void testVisualizarChamadoPorCodigo() {
        Date data = new Date();
        Chamado chamado = new Chamado(1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1);
        sistemaTI.criarChamado(chamado);

        Chamado encontrado = sistemaTI.visualizarChamadoPorCodigo(1);

        assertEquals(chamado, encontrado);
    }

    @Test
    public void testVisualizarChamadosPorStatus() {
        Chamado chamado1 = new Chamado(1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1);
        Chamado chamado2 = new Chamado(2, "Título", LocalDate.now(), "Alta", "In Progress", "Computador BR7 não liga", 1, 4);
        Chamado chamado3 = new Chamado(2, "Título", LocalDate.now(), "Alta", "In Progress", "Computador BR7 não liga", 1, 4);

        sistemaTI.criarChamado(chamado1);
        sistemaTI.criarChamado(chamado2);
        sistemaTI.criarChamado(chamado3);

        List<Chamado> chamadosEncontrados = sistemaTI.visualizarChamadosPorStatus("In Progress", 1);

        assertEquals(2, chamadosEncontrados.size());
        assertTrue(chamadosEncontrados.contains(chamado2));
    }

    @Test
    public void testVisualizarTodosChamados() {
        Chamado chamado1 = new Chamado(1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1);
        Chamado chamado2 = new Chamado(2, "Título", LocalDate.now(), "Alta", "In Progress", "Computador BR7 não liga", 3, 4);
        sistemaTI.criarChamado(chamado1);
        sistemaTI.criarChamado(chamado2);

        List<Chamado> chamados = sistemaTI.visualizarTodosChamados();

        assertEquals(2, chamados.size());
    }

    @Test
    public void testAlterarStatusChamado() {
        Chamado chamado = new Chamado(1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1);
        sistemaTI.criarChamado(chamado);

        sistemaTI.alterarStatusChamado("Fechado", 1);

        Chamado chamadoAlterado = sistemaTI.visualizarChamadoPorCodigo(1);
        assertEquals("Fechado", chamadoAlterado.getStatus());
    }

    @Test
    public void testAlterarPrioridadeChamado() {
        Chamado chamado = new Chamado(1, "Título", LocalDate.now(), "Baixa", "New", "Computador BR não liga", 1, 1);
        sistemaTI.criarChamado(chamado);

        sistemaTI.alterarPrioridadeChamado("Alta", 1);

        Chamado chamadoAlterado = sistemaTI.visualizarChamadoPorCodigo(1);
        assertEquals("Alta", chamadoAlterado.getPrioridade());
    }
}
