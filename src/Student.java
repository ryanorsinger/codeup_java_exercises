/*
 * Student class is the blueprint for student objects
 * Each student object represents an actual student
 */


public class Student {

    String firstName;
    String lastName;
    int score;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
}