package test;

import controllers.GerenciamentoDiscipline;
import controllers.GerenciamentoProfessor;
import controllers.GerenciamentoStudent;
import entities.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Controle_Academico_spec {
    Discipline MAP = new Discipline("MAP", "SEG 11:00");
    Discipline APS = new Discipline("APS", "QUI 7:00");
    Discipline[] DisciplinasdeThiago = new Discipline[2];
    Discipline[] DisciplinasdeRafa = new Discipline[1];

    Student Rafa = new Student("Rafinha", 1, DisciplinasdeRafa);
    Student Thiago = new Student("Thiago", 12, DisciplinasdeThiago);


    ArrayList<Discipline> disciplinasDoDrThiago = new ArrayList<>();

    Teacher professor = new Teacher("Dr thiago", 123, disciplinasDoDrThiago);
    GerenciamentoProfessor gerenciamentoP = new GerenciamentoProfessor(professor);

    GerenciamentoDiscipline gerenciamentoMAP = new GerenciamentoDiscipline(MAP);
    GerenciamentoDiscipline gerenciamentoAPS = new GerenciamentoDiscipline(APS);

    GerenciamentoStudent gerenciaRafa = new GerenciamentoStudent(Rafa);
    GerenciamentoStudent gerenciaThiago = new GerenciamentoStudent(Thiago);


    @Test
    public void DisciplinasDeUmProfessor () throws Exception {
        disciplinasDoDrThiago.add(MAP);
        disciplinasDoDrThiago.add(APS);
        Discipline[] expected = new Discipline[2];
        expected[0] = MAP;
        expected[1] = APS;
        String[] values = gerenciamentoP.Disciplinas();

        Assertions.assertEquals(expected[0].getName(), values[0]);
    }

    @Test
    public void AlunosDeUmaDisciplina() throws Exception {
        DisciplinasdeThiago[0] = MAP;
        DisciplinasdeThiago[1] = APS;
        DisciplinasdeRafa[0] = MAP;

        gerenciamentoMAP.addStudent(Rafa);
        gerenciamentoMAP.addStudent(Thiago);

        String[] expected = new String[2];
        expected[0] = "Rafinha";
        expected[1] = "Thiago";
        Assertions.assertArrayEquals(expected,  gerenciamentoMAP.getAllStudents());
    }
    @Test
    public void HorariosDeUmProfessor () throws Exception {
        disciplinasDoDrThiago.add(MAP);
        disciplinasDoDrThiago.add(APS);
        String[] expected = new String[1];
        expected[0] = "SEG 11:00";
        String[] horarios = gerenciamentoP.getHorario();
        Assertions.assertEquals(expected[0], horarios[0]);
    }
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
    public void NumeroDeAlunos () throws Exception {
        gerenciamentoMAP.addStudent(Rafa);
        gerenciamentoMAP.addStudent(Thiago);
        Assertions.assertEquals(2, gerenciamentoMAP.getQuantityOfStudents());
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
