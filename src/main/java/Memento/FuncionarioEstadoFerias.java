package Memento;

public class FuncionarioEstadoFerias implements FuncionarioEstado {

    private FuncionarioEstadoFerias() {};
    private static FuncionarioEstadoFerias instance = new FuncionarioEstadoFerias();
    public static FuncionarioEstadoFerias getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Férias";
    }

}
