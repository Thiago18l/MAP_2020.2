package controllers;

import entities.Discipline;
import entities.Student;

import java.util.ArrayList;

public class GerenciamentoDiscipline {
    private Integer NumberOfStudents = 0;
    private ArrayList<Student> estudantes = new ArrayList<>();
    private Discipline disciplina;

    public GerenciamentoDiscipline(String name, String date){
        this.disciplina = new Discipline(name, date);
    }

    public void addStudent(String nome, Integer matricula, Discipline[] disciplinas) {
        estudantes.add(new Student(nome, matricula, disciplinas));
        this.NumberOfStudents += 1;
    }
    public Discipline getDisciplina() {
        return this.disciplina;
    }
    public ArrayList<Student> getStudent() {
        return this.estudantes;
    }

    public Integer getQuantityOfStudents() {
        return this.estudantes.size();
    }

    public void setNumberOfStudents(Integer number) {
        this.NumberOfStudents += number;
    }

    public String[] getAllStudents() {
        String[] names = new String[estudantes.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = estudantes.get(i).getName();
        }
        return names;
    }
    @Override
    public String toString() {
        return "\n" +
                "\tNome: " + this.disciplina.getName() +
                "\n\tNumero de Alunos Matriculados: " + NumberOfStudents +
                "\n\tHorario: " + this.disciplina.getData() + "\n";
    }
}
