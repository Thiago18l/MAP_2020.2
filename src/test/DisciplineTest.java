package test;

import controllers.GerenciamentoDiscipline;
import controllers.GerenciamentoProfessor;
import controllers.GerenciamentoStudent;
import entities.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DisciplineTest {
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
    public void AlunosDeUmaDisciplina() throws Exception {
        DisciplinasdeThiago[0] = MAP;
        DisciplinasdeThiago[1] = APS;
        DisciplinasdeRafa[0] = MAP;

        gerenciamentoMAP.addStudent("Rafinha", 1, DisciplinasdeRafa);
        gerenciamentoMAP.addStudent("Thiago", 12, DisciplinasdeThiago);

        String[] expected = new String[2];
        expected[0] = "Rafinha";
        expected[1] = "Thiago";
        Assertions.assertArrayEquals(expected,  gerenciamentoMAP.getAllStudents());
    }
    @Test
    public void NumeroDeAlunos () throws Exception {
        gerenciamentoMAP.addStudent("Rafinha", 1, DisciplinasdeRafa);
        gerenciamentoMAP.addStudent("Thiago", 12, DisciplinasdeThiago);
        Assertions.assertEquals(2, gerenciamentoMAP.getQuantityOfStudents());
    }
}
