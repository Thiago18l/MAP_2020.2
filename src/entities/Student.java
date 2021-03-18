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

    public String getHorarios() {
        String n = "";
        for (Discipline i : disciplines) {
            n += i.getData().toString();
            n += "/n";
        }
        return n;
    }
    @Override
    public String toString() {
        return "Estudante \n" +
                "Nome: " + name +
                "\nMatricula: " + matricula +
                "\nDisciplinas: " + Arrays.toString(disciplines);
    }
}