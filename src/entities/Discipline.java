package entities;

import java.util.ArrayList;

public class Discipline {
    private String name;
    private Integer NumberOfStudents = 0;
    private String data;
    private ArrayList<Student> estudantes = new ArrayList<>();

    public Discipline() {

    }

    public Discipline(String name, String data) {
        this.name = name;
        this.data = data;
    }
    public void addStudent(Student estudante) {
        estudantes.add(estudante);
        this.NumberOfStudents += 1;
    }
    public ArrayList<Student> getStudent() {
        return this.estudantes;
    }
    public Integer getQuantityOfStudents() {
        return this.estudantes.size();
    }
    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfStudents(Integer number) {
        this.NumberOfStudents += number;
    }

    @Override
    public String toString() {
        return "\n" +
                "\tNome: " + name +
                "\n\tNumero de Alunos Matriculados: " + NumberOfStudents +
                "\n\tHorario: " + data + "\n";
    }
}
