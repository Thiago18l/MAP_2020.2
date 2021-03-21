package controllers;

import entities.Student;

import java.util.Arrays;

public class GerenciamentoStudent {
    private Student student;


    public GerenciamentoStudent(Student student){
        this.student = student;
    }

    public String[] getHorarios() {
        String[] horarios = new String[this.student.getDisciplines().length];
        for (int i = 0; i < horarios.length; i++) {
            assert this.student.getDisciplines()[i] != null;
            horarios[i] = this.student.getDisciplines()[i].getData();
        }
        return horarios;
    }
    public String[] getDisciplinas() {
        String[] nomes = new String[this.student.getDisciplines().length];
        for (int i = 0; i < this.student.getDisciplines().length; i++) {
            nomes[i] = this.student.getDisciplines()[i].getName();
        }
        return nomes;
    }
    @Override
    public String toString() {
        return "Estudante \n" +
                "Nome: " + this.student.getName() +
                "\nMatricula: " + this.student.getMatricula() +
                "\nDisciplinas: " + Arrays.toString(this.student.getDisciplines());
    }
}
