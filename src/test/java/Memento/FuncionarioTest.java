package Memento;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class FuncionarioTest {

    @Test
    void deveArmazenarEstados() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertEquals(2, funcionario.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        funcionario.restauraEstado(0);
        assertEquals(FuncionarioEstadoContratado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Funcionario funcionario = new Funcionario();
        funcionario.setEstado(FuncionarioEstadoContratado.getInstance());
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        funcionario.restauraEstado(0);
        assertEquals(FuncionarioEstadoContratado.getInstance(), funcionario.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
