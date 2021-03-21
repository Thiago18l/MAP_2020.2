package entities;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Teacher {
    private String name;
    private ArrayList<Discipline> disciplines;
    private Integer matricula;

    public Teacher(String name, Integer matricula, ArrayList<Discipline> disciplinas) {
        this.name = name;
        setMatricula(matricula);
        this.disciplines = disciplinas;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }
}
