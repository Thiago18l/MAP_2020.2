import controllers.GerenciamentoDiscipline;
import controllers.GerenciamentoProfessor;
import controllers.GerenciamentoStudent;
import entities.*;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {


        Discipline[] DisciplinasdeThiago = new Discipline[2];
        Discipline[] DisciplinasdeRafa = new Discipline[1];

        GerenciamentoDiscipline gerenciamentoMAP = new GerenciamentoDiscipline("MAP", "SEG 11:00");
        GerenciamentoDiscipline gerenciamentoAPS = new GerenciamentoDiscipline("APS", "QUI 7:00");

        DisciplinasdeThiago[0] = gerenciamentoMAP.getDisciplina();
        DisciplinasdeThiago[1] = gerenciamentoAPS.getDisciplina();
        DisciplinasdeRafa[0] = gerenciamentoMAP.getDisciplina();

        GerenciamentoStudent gerenciamentoRafa = new GerenciamentoStudent("Rafinha", 1, DisciplinasdeRafa);

        //Professor
        ArrayList<Discipline> disciplinasDoDrThiago = new ArrayList<>();
        disciplinasDoDrThiago.add(gerenciamentoMAP.getDisciplina());
        disciplinasDoDrThiago.add(gerenciamentoAPS.getDisciplina());
        GerenciamentoProfessor gerenciamentoP = new GerenciamentoProfessor("Dr thiago", 123, disciplinasDoDrThiago);


        //Gerenciamento de disciplinas = Adição de alunos
        gerenciamentoMAP.addStudent("Rafinha", 1, DisciplinasdeRafa);
        gerenciamentoMAP.addStudent("Thiago", 12, DisciplinasdeThiago);
        gerenciamentoAPS.addStudent("Thiago", 12, DisciplinasdeThiago);


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
