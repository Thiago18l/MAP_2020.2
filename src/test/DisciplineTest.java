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
    Discipline[] DisciplinasdeThiago = new Discipline[2];
    Discipline[] DisciplinasdeRafa = new Discipline[1];

    ArrayList<Discipline> disciplinasDoDrThiago = new ArrayList<>();

    GerenciamentoProfessor gerenciamentoP = new GerenciamentoProfessor("Dr thiago", 123, disciplinasDoDrThiago);

    GerenciamentoDiscipline gerenciamentoMAP = new GerenciamentoDiscipline("MAP", "SEG 11:00");
    GerenciamentoDiscipline gerenciamentoAPS = new GerenciamentoDiscipline("APS", "QUI 7:00");

    GerenciamentoStudent gerenciaRafa = new GerenciamentoStudent("Rafinha", 1, DisciplinasdeRafa);
    GerenciamentoStudent gerenciaThiago = new GerenciamentoStudent("Thiago", 12, DisciplinasdeThiago);


    @Test
    public void AlunosDeUmaDisciplina() throws Exception {
        DisciplinasdeThiago[0] = gerenciamentoMAP.getDisciplina();
        DisciplinasdeThiago[1] = gerenciamentoAPS.getDisciplina();
        DisciplinasdeRafa[0] = gerenciamentoAPS.getDisciplina();

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
