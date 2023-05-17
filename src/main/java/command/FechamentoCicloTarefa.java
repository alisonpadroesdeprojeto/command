package command;

public class FechamentoCicloTarefa implements Tarefa {

    private final Ciclo ciclo;

    public FechamentoCicloTarefa(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public void executar() {
        this.ciclo.fecharCiclo();
    }

    public void cancelar() {
        this.ciclo.abrirCiclo();
    }
}
