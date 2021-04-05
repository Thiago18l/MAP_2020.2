package test;

import controllers.GerenciamentoDiscipline;
import controllers.GerenciamentoStudent;
import entities.Discipline;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AlunosTest {
    GerenciamentoDiscipline gerenciaMAP = new GerenciamentoDiscipline("MAP", "SEG 11:00");
    GerenciamentoDiscipline gerenciaAPS = new GerenciamentoDiscipline("APS", "QUI 7:00");
    GerenciamentoDiscipline gerenciaBD = new GerenciamentoDiscipline("BANCO DE DADOS", "QUARTA 7:00");
    Discipline[] DisciplinasdeThiago = new Discipline[2];
    Discipline[] DisciplinasdeRafa = new Discipline[1];

    GerenciamentoStudent gerenciaRafa = new GerenciamentoStudent("Rafinha", 1, DisciplinasdeRafa);
    GerenciamentoStudent gerenciaThiago = new GerenciamentoStudent("Thiago", 12, DisciplinasdeThiago);
    @Test
    public void DisciplinasDeUmAluno() throws Exception {
        DisciplinasdeThiago[0] = gerenciaMAP.getDisciplina();
        DisciplinasdeThiago[1] = gerenciaAPS.getDisciplina();
        DisciplinasdeRafa[0] = gerenciaMAP.getDisciplina();
        String expected = "MAP";
        String[] disciplina = gerenciaRafa.getDisciplinas();
        String[] disciplinaThiago = gerenciaThiago.getDisciplinas();
        Assertions.assertEquals(expected, disciplina[0]);
        Assertions.assertEquals(expected, disciplinaThiago[0]);
    }
    @Test
    public void QuaisHorariosDeUmAluno () throws Exception {
        Discipline[] disciplinaJoao = new Discipline[1];
        disciplinaJoao[0] = gerenciaBD.getDisciplina();
        GerenciamentoStudent gerenciaJoao = new GerenciamentoStudent("Joao", 1, disciplinaJoao);
        String[] expected = new String[1];
        expected[0] = "QUARTA 7:00";
        System.out.println(Arrays.toString(gerenciaJoao.getHorarios()));
        Assertions.assertArrayEquals(expected, gerenciaJoao.getHorarios());
    }
}
