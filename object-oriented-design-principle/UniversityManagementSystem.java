import java.util.*;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Course {
    String title;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String title) {
        this.title = title;
    }

    void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    void enrollStudent(Student student) {
        students.add(student);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}