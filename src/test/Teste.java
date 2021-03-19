package test;
import static org.junit.jupiter.api.Assertions.*;
import entities.Discipline;
import entities.Student;
import entities.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste {
    Discipline MAP = new Discipline("MAP", "11:00");
    Discipline APS = new Discipline("APS", "7:00");
    Discipline[] DisciplinasdeThiago = new Discipline[2];
    Discipline[] DisciplinasdeRafa = new Discipline[1];

    Student Rafa = new Student("Rafinha", 1, DisciplinasdeRafa);
    Student Thiago = new Student("Thiago", 12, DisciplinasdeThiago);


    ArrayList<Discipline> disciplinasDoDrThiago = new ArrayList<>();

    Teacher professor = new Teacher("Dr thiago", 123, disciplinasDoDrThiago);



    @Test
    public void disciplinasProfessor() throws Exception {
        disciplinasDoDrThiago.add(MAP);
        disciplinasDoDrThiago.add(APS);

        assertEquals("MAP, APS, ", MAP.getStudent());
    }

    @Test
    public void alunosDeUmaDisciplina() throws Exception {
        DisciplinasdeThiago[0] = MAP;
        DisciplinasdeThiago[1] = APS;
        DisciplinasdeRafa[0] = MAP;

        MAP.addStudent(Rafa);
        MAP.addStudent(Thiago);

        //assertEquals( MAP.getStudent());
    }
    @Test
    public void disciplinasAluno() throws Exception {

        Discipline ponto[] = new Discipline[1];
        ponto[0] =  MAP;
        assertArrayEquals(ponto, Rafa.getDisciplines());
    }

    @Test
    public void numerosAluno() throws Exception {

        MAP.addStudent(Rafa);
        MAP.addStudent(Thiago);
        assertEquals(2, MAP.getQuantityOfStudents());
    }







}
