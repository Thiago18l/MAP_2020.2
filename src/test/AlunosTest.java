package test;

import controllers.GerenciamentoStudent;
import entities.Discipline;
import entities.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AlunosTest {

    Discipline MAP = new Discipline("MAP", "SEG 11:00");
    Discipline APS = new Discipline("APS", "QUI 7:00");
    Discipline[] DisciplinasdeThiago = new Discipline[2];
    Discipline[] DisciplinasdeRafa = new Discipline[1];

    Student Rafa = new Student("Rafinha", 1, DisciplinasdeRafa);
    Student Thiago = new Student("Thiago", 12, DisciplinasdeThiago);

    GerenciamentoStudent gerenciaRafa = new GerenciamentoStudent(Rafa);
    GerenciamentoStudent gerenciaThiago = new GerenciamentoStudent(Thiago);
    @Test
    public void DisciplinasDeUmAluno() throws Exception {
        DisciplinasdeThiago[0] = MAP;
        DisciplinasdeThiago[1] = APS;
        DisciplinasdeRafa[0] = MAP;
        String expected = "MAP";
        String[] disciplina = gerenciaRafa.getDisciplinas();
        String[] disciplinaThiago = gerenciaThiago.getDisciplinas();
        Assertions.assertEquals(expected, disciplina[0]);
        Assertions.assertEquals(expected, disciplinaThiago[0]);
    }
    @Test
    public void QuaisHorariosDeUmAluno () throws Exception {
        Discipline[] disciplinaJoao = new Discipline[1];
        disciplinaJoao[0] = new Discipline("BANCO DE DADOS", "QUARTA 7:00");
        Student Joao = new Student("Joao", 1, disciplinaJoao);
        GerenciamentoStudent gerenciaJoao = new GerenciamentoStudent(Joao);
        String[] expected = new String[1];
        expected[0] = "QUARTA 7:00";
        System.out.println(Arrays.toString(gerenciaJoao.getHorarios()));
        Assertions.assertArrayEquals(expected, gerenciaJoao.getHorarios());
    }
}
