import entities.Discipline;
import entities.Student;
import entities.Teacher;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Discipline MAP = new Discipline("MAP", "11:00");
        Discipline APS = new Discipline("APS", "7:00");
        Discipline[] DisiciplinasdeThiago = new Discipline[2];
        Discipline[] DisiciplinasdeRafa = new Discipline[1];
        DisiciplinasdeThiago[0] = MAP;
        DisiciplinasdeThiago[1] = APS;
        DisiciplinasdeRafa[0] = MAP;
        Student Rafa = new Student("Rafinha", 1, DisiciplinasdeRafa);
        Student Thiago = new Student("Thiago", 12, DisiciplinasdeThiago);
        MAP.addStudent(Rafa);
        MAP.addStudent(Thiago);
        APS.addStudent(Thiago);
        System.out.println(MAP.getStudent());
        System.out.println(MAP.getQuantityOfStudents());

        ArrayList<Discipline> disciplinasDoDrThiago = new ArrayList<>();
        disciplinasDoDrThiago.add(MAP);
        disciplinasDoDrThiago.add(APS);
        Teacher professor = new Teacher("Dr thiago", 123, disciplinasDoDrThiago);

        System.out.println(professor.toString());

    }
}
