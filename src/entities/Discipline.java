package entities;

import java.util.ArrayList;

public class Discipline {
    private String name;
   // private Integer NumberOfStudents = 0;
    private String data;
   // private ArrayList<Student> estudantes = new ArrayList<>();

    public Discipline() {

    }

    public Discipline(String name, String data) {
        this.name = name;
        this.data = data;
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

}
