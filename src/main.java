import entities.Discipline;
import entities.Teacher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Discipline> disciplinasProf = new ArrayList<>();
        Discipline disciplina = null;
        Teacher teacher;

        Scanner input = new Scanner(System.in);
        System.out.println("------------------- CONTROLE ACADEMICO -------------------------------");
        try {
            for (int i = 1; i <= 50; i++) {
                System.out.printf("  %d%%\r", i * 2);
                for (int j = 0; j < i; j++) {
                    if (j == 0)
                        System.out.printf("  ");
                    System.out.printf("%c", 62);
                    Thread.sleep(1);
                }
            }
            System.out.println("\n\n\n ");

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        Integer option = 0;
        do {
            System.out.println("-------------------MENU------------------------");
            System.out.print("1 - Professor");
            System.out.print("\t2 - Aluno\n");
            System.out.println(" ");
            System.out.print("3 - Disciplinas");
            System.out.print("\t\t4 - Sair\n");
            System.out.print("Digite a opção que você deseja:");
            option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("---------- PROFESSORES --------------");
                    System.out.println("1 - CADASTRAR NOVO PROFESSOR");
                    System.out.println("2 - DISCIPLINAS DO PROFESSOR");
                    System.out.println("3 - HORÁRIOS DO PROFESSOR");
                    Integer number = input.nextInt();
                    if (number == 1) {
                        System.out.println("------ CADASTRAR PROFESSOR --------");
                        String name;
                        int matricula;
                        try {
                            System.out.println("Nome:");
                            name = input.nextLine();
                            System.out.println(" ");
                            input.next();
                            System.out.println("Matricula: ");
                            matricula = input.nextInt();

                            System.out.println("Digite a quantidade de disciplinas:");
                            int numberDisiciplinas = input.nextInt();
                            for (int i = 0; i < numberDisiciplinas; i++) {
                                System.out.println("Nome da disciplina:");
                                input.next();
                                String disciplinaNome = input.nextLine();
                                System.out.println("Horário da Disciplina:" );
                                String horario = input.nextLine();
                                disciplina = new Discipline(disciplinaNome, horario);
                                disciplinasProf.add(disciplina);
                            }
                            assert disciplina != null;
                            System.out.println(disciplina.getData());
                            teacher = new Teacher(name, matricula, disciplinasProf);
                            System.out.println(Arrays.toString(teacher.Disciplinas()));

                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    }
            }
        } while (option != 4);
        input.close();
    }
}
