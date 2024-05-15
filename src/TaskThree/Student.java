package TaskThree;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private int mathGrade;
    private int physicsGrade;
    private int englishGrade;

    public Student(String name, String group, int course, int mathGrade, int physicsGrade, int englishGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.englishGrade = englishGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", group='" + group + '\'' +
               ", course=" + course +
               ", mathGrade=" + mathGrade +
               ", physicsGrade=" + physicsGrade +
               ", englishGrade=" + englishGrade +
               '}';
    }

    public static void auditStudents(List<Student> students) {
        for (Student student : students) {
            if ((student.mathGrade + student.physicsGrade + student.englishGrade) / 3 < 3) {
                students.remove(student);
            } else {
                student.course = student.course + 1;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        boolean check = false;
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name + " учиться на " + course + " курсе.");
                check = true;
            }
        }
        if (!check) {
            System.out.println("Студентов, учащихся на " + course + " курсе нет!");
        }
    }
}
