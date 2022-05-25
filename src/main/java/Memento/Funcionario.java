package Memento;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private FuncionarioEstado funcionarioEstado;
    private List<FuncionarioEstado> memento = new ArrayList<FuncionarioEstado>();

    public FuncionarioEstado getEstado() {
        return this.funcionarioEstado;
    }

    public void setEstado(FuncionarioEstado estado) {
        this.funcionarioEstado = estado;
        this.memento.add(this.funcionarioEstado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.funcionarioEstado = this.memento.get(indice);
    }

    public List<FuncionarioEstado> getEstados() {
        return this.memento;
    }

}
