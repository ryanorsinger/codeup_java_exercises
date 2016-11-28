import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Moravia on 11/28/16.
 */

public class StudentRecordApp {
    // Main method contains our procedural code
    public static void main(String[] args) {

        // prompt user for input
        // how many students?
        // then instantiate or create that many student objects
        Scanner sc = new Scanner(System.in);
        String addMoreStudents;
        String firstName;
        String lastName;
        int score;

        System.out.println("Welcome to the student records application");

            System.out.print("Please input the student's first name: ");
            firstName = sc.nextLine();

            System.out.print("Please input the student's last name: ");
            lastName = sc.nextLine();

            System.out.println("Please input that student's score: ");
            score = sc.nextInt();

            // use this syntax if you've build a constructor method on the Student class
            Student newStudent = new Student(firstName, lastName, score);

            System.out.println(newStudent);

        ArrayList<Student> students = new ArrayList<>();
        students.add(newStudent);

    }
}
