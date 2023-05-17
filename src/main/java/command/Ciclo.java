package command;

public class Ciclo {
    private final int ano;
    private final int semestre;
    private String situacao;

    public Ciclo(int ano, int semestre) {
        this.ano = ano;
        this.semestre = semestre;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirCiclo() {
        this.situacao = "Ciclo " + ano + "." + semestre + " aberto";
    }

    public void fecharCiclo() {
        this.situacao = "Ciclo " + ano + "." + semestre + " fechado";
    }
}
