package command;

public class AberturaCicloTarefa implements Tarefa {

    private final Ciclo ciclo;

    public AberturaCicloTarefa(Ciclo ciclo) {
        this.ciclo = ciclo;
    }

    public void executar() {
        this.ciclo.abrirCiclo();
    }

    public void cancelar() {
        this.ciclo.fecharCiclo();
    }
}
