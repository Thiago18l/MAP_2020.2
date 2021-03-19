package entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private Integer matricula;
    private final Discipline[] disciplines;

    public Student(String name, Integer matricula, Discipline[] disciplines) {
        this.name = name;
        this.matricula = matricula;
        this.disciplines = disciplines;
    }

    public Discipline[] getDisciplines() {
        return disciplines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String[] getHorarios() {
        String[] horarios = new String[disciplines.length];
        for (int i = 0; i < horarios.length; i++) {
            assert disciplines[i] != null;
            horarios[i] = disciplines[i].getData();
        }
        return horarios;
    }
    public String[] getDisciplinas() {
        String[] nomes = new String[this.disciplines.length];
        for (int i = 0; i < this.disciplines.length; i++) {
            nomes[i] = disciplines[i].getName();
        }
        return nomes;
    }
    @Override
    public String toString() {
        return "Estudante \n" +
                "Nome: " + name +
                "\nMatricula: " + matricula +
                "\nDisciplinas: " + Arrays.toString(disciplines);
    }
}