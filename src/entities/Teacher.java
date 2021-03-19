package entities;
import java.util.ArrayList;
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
