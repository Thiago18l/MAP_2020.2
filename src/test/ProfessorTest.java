package test;

import controllers.GerenciamentoProfessor;
import entities.Discipline;
import entities.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ProfessorTest {
    Discipline MAP = new Discipline("MAP", "SEG 11:00");
    Discipline APS = new Discipline("APS", "QUI 7:00");

    ArrayList<Discipline> disciplinasDoDrThiago = new ArrayList<>();

    Teacher professor = new Teacher("Dr thiago", 123, disciplinasDoDrThiago);
    GerenciamentoProfessor gerenciamentoP = new GerenciamentoProfessor(professor);


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
    public void DisciplinasDeUmProfessor () throws Exception {
        disciplinasDoDrThiago.add(MAP);
        disciplinasDoDrThiago.add(APS);

        String[] expected = new String[2];
        expected[0] = "MAP";
        expected[1] = "APS";
        String[] horarios = gerenciamentoP.Disciplinas();
        Assertions.assertEquals(expected[0], horarios[0]);
    }

}
