public class StudentReport {
    String name;
    int rollNumber;
    int marks;

    StudentReport(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 50) return "C";
        if (marks >= 35) return "D";
        return "F";
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        StudentReport s = new StudentReport("Alice", 12, 88);
        s.displayDetails();
    }
}