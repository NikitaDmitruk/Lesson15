package TaskThree;

import javax.sound.midi.Soundbank;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Igor", "C", 2, 3, 4, 5));
        students.add(new Student("Petr", "A", 1, 3, 5, 2));
        students.add(new Student("Lena", "B", 3, 5, 5, 5));
        for (Student student : students) {
            System.out.println(student.toString());
        }
        Student.auditStudents(students);
        System.out.println("Список студентов после проверки:");
        for (Student student : students) {
            System.out.println(student.toString());
        }
        Student.printStudents(students, 2);
    }
}
