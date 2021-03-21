import controllers.GerenciamentoDiscipline;
import controllers.GerenciamentoProfessor;
import controllers.GerenciamentoStudent;
import entities.*;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        //Disciplinas
        Discipline MAP = new Discipline("MAP", "SEG 11:00");
        Discipline APS = new Discipline("APS", "QUI 7:00");

        Discipline[] DisciplinasdeThiago = new Discipline[2];
        Discipline[] DisciplinasdeRafa = new Discipline[1];

        GerenciamentoDiscipline gerenciamentoMAP = new GerenciamentoDiscipline(MAP);
        GerenciamentoDiscipline gerenciamentoAPS = new GerenciamentoDiscipline(APS);

        //Alunos
        Student Rafa = new Student("Rafinha", 1, DisciplinasdeRafa);
        Student Thiago = new Student("Thiago", 12, DisciplinasdeThiago);

        DisciplinasdeThiago[0] = MAP;
        DisciplinasdeThiago[1] = APS;
        DisciplinasdeRafa[0] = MAP;

        GerenciamentoStudent gerenciamentoRafa = new GerenciamentoStudent(Rafa);

        //Professor
        ArrayList<Discipline> disciplinasDoDrThiago = new ArrayList<>();
        disciplinasDoDrThiago.add(MAP);
        disciplinasDoDrThiago.add(APS);
        Teacher professor = new Teacher("Dr thiago", 123, disciplinasDoDrThiago);
        GerenciamentoProfessor gerenciamentoP = new GerenciamentoProfessor(professor);


        //Gerenciamento de disciplinas = Adição de alunos
        gerenciamentoMAP.addStudent(Rafa);
        gerenciamentoMAP.addStudent(Thiago);
        gerenciamentoAPS.addStudent(Thiago);


        //Disciplinas do professor:
        System.out.println(Arrays.toString(gerenciamentoP.Disciplinas()));
        //Horários do professor
        System.out.println(Arrays.toString(gerenciamentoP.getHorario()));

        //Alunos da disciplina MAP
        System.out.println(Arrays.toString(gerenciamentoMAP.getAllStudents()));

        //Disciplinas de um aluno
        System.out.println(Arrays.toString(gerenciamentoRafa.getDisciplinas()));

        //Números de alunos
        System.out.println(gerenciamentoMAP.getQuantityOfStudents());

        //Horário de um aluno
        System.out.println(Arrays.toString(gerenciamentoRafa.getHorarios()));

    }
}
