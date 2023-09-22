import Models.Chamado;
import Models.Pessoa;
import Models.SistemaTI;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestSistemaTI {
    private SistemaTI sistema = sistema = new SistemaTI();;

    @Test
    public void testLogarComSucesso() {
        Pessoa pessoa = new Pessoa(1, "usuario1", "usuario1@example.com", "senha123", false);
        sistema.addPessoa(pessoa);

        Pessoa resultado = sistema.logar(pessoa);

        assertNotNull(resultado);
    }

    @Test
    public void testLogarComFalha() {
        Pessoa pessoa = new Pessoa(1, "usuario1", "usuario1@example.com", "senha123", false);
        sistema.addPessoa(pessoa);

        Pessoa pessoaInvalida = new Pessoa(2, "usuario2", "usuario2@example.com", "senha456", false);

        Pessoa resultado = sistema.logar(pessoaInvalida);

        assertNull(resultado);
    }

    @Test
    public void testCriarChamadoComSucesso() {
        Chamado chamado = new Chamado(1, "Título", LocalDate.now(), "Alta", "Aberto", "Descrição", 1, 2);

        sistema.criarChamado(chamado);

        List<Chamado> chamados = sistema.visualizarTodosChamados();
        assertTrue(chamados.contains(chamado));
    }

    @Test
    public void testCriarChamadoComFalha() {
        Chamado chamadoInvalido = new Chamado(2, null, LocalDate.now(), "Alta", "Aberto", "Descrição", 1, 2);

        sistema.criarChamado(chamadoInvalido);

        List<Chamado> chamados = sistema.visualizarTodosChamados();
        assertFalse(chamados.contains(chamadoInvalido));
    }
}
