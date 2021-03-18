package entities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Teacher {
    private String name;
    private Map<Integer, ArrayList<Discipline>> classes = new HashMap<>();
    private Integer matricula;
    public Teacher(String name, Integer matricula, ArrayList<Discipline> disciplinas) {
        this.name = name;
        setMatricula(matricula);
        classes.put(this.getMatricula(), disciplinas);
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Discipline> getDisciplinas() {
        ArrayList<Discipline> arrays = classes.get(matricula);
        return arrays;
    }
    private String Disciplinas() {
        ArrayList<Discipline> disciplinas = getDisciplinas();
        String[] turmas = new String[disciplinas.size()];
        for (int i = 0; i < disciplinas.size(); i++) {
            turmas[i] = disciplinas.get(i).getName();
        }
        String n = "";
        for(String i : turmas) {
            n += i;
            n += ", ";
        }
        return n;
    }
    @Override
    public String toString() {
        return "Professor: " + name +
                ",\nTurmas: " + Disciplinas() +
                "\nSua matricula: " + matricula;
    }
}
