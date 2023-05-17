package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiretoriaTest {

    Diretoria diretoria;
    Ciclo ciclo;

    @BeforeEach
    void setUp() {
        diretoria = new Diretoria();
        ciclo = new Ciclo (2023, 1);
    }

    @Test
    void deveAbrirCiclo() {
        Tarefa aberturaCiclo = new AberturaCicloTarefa(ciclo);
        diretoria.executarTarefa(aberturaCiclo);

        assertEquals("Ciclo 2023.1 aberto", ciclo.getSituacao());
    }

    @Test
    void deveFecharCiclo() {
        Tarefa fechamentoCiclo = new FechamentoCicloTarefa(ciclo);
        diretoria.executarTarefa(fechamentoCiclo);

        assertEquals("Ciclo 2023.1 fechado", ciclo.getSituacao());
    }

    @Test
    void deveCancelarFechamentoCiclo() {
        Tarefa aberturaCiclo = new AberturaCicloTarefa(ciclo);
        Tarefa fechamentoCiclo = new FechamentoCicloTarefa(ciclo);

        diretoria.executarTarefa(aberturaCiclo);
        diretoria.executarTarefa(fechamentoCiclo);

        diretoria.cancelarUltimaTarefa();

        assertEquals("Ciclo 2023.1 aberto", ciclo.getSituacao());
    }

    @Test
    void deveCancelarAberturaCiclo() {
        Tarefa fechamentoCiclo = new FechamentoCicloTarefa(ciclo);
        Tarefa aberturaCiclo = new AberturaCicloTarefa(ciclo);

        diretoria.executarTarefa(fechamentoCiclo);
        diretoria.executarTarefa(aberturaCiclo);

        diretoria.cancelarUltimaTarefa();

        assertEquals("Ciclo 2023.1 fechado", ciclo.getSituacao());
    }
}