package controllers;

import entities.Discipline;
import entities.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GerenciamentoProfessor {
    private Teacher professor;
    private Map<Integer, ArrayList<Discipline>> classes = new HashMap<>();

    public GerenciamentoProfessor(String name, Integer matricula, ArrayList<Discipline> disciplines){
        this.professor = new Teacher(name, matricula, disciplines);
        classes.put(professor.getMatricula(), this.professor.getDisciplines());
    }

    public ArrayList<Discipline> getDisciplinas() {
        ArrayList<Discipline> arrays = classes.get(this.professor.getMatricula());
        return arrays;
    }

    public String[] Disciplinas() {
        ArrayList<Discipline> disciplinas = getDisciplinas();
        String[] turmas = new String[disciplinas.size()];
        for (int i = 0; i < disciplinas.size(); i++) {
            turmas[i] = disciplinas.get(i).getName();
        }

        return turmas;
    }
    public String[] getHorario() {
        ArrayList<Discipline> horarios = getDisciplinas();
        String[] horario = new String[horarios.size()];
        for (int i = 0; i < horarios.size(); i++) {
            horario[i] = horarios.get(i).getData();
        }
        return horario;
    }
}
