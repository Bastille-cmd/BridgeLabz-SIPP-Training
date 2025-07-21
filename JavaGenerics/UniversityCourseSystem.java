import java.util.*;

abstract class CourseType {
    String title;
    CourseType(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}

class ExamCourse extends CourseType {
    ExamCourse(String title) {
        super(title);
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String title) {
        super(title);
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String title) {
        super(title);
    }
}

class Course<T extends CourseType> {
    T courseType;
    Course(T courseType) {
        this.courseType = courseType;
    }
    T getCourseType() {
        return courseType;
    }
}

public class UniversityCourseSystem {
    static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
    public static void main(String[] args) {
        List<CourseType> list = new ArrayList<>();
        list.add(new ExamCourse("Math"));
        list.add(new AssignmentCourse("English"));
        displayCourses(list);
    }
}