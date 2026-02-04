package main;

import dao.StudentDAO;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add  2.View  3.Update  4.Delete  5.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Email: ");
                    String email = sc.next();
                    System.out.print("Course: ");
                    String course = sc.next();
                    dao.addStudent(name, email, course);
                    break;

                case 2:
                    dao.viewStudents();
                    break;

                case 3:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Course: ");
                    dao.updateStudent(id, sc.next());
                    break;

                case 4:
                    System.out.print("ID: ");
                    dao.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
