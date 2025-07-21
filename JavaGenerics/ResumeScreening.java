import java.util.*;

abstract class JobRole {
    String title;
    JobRole(String title) {
        this.title = title;
    }
    public String toString() {
        return title;
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    T role;
    Resume(T role) {
        this.role = role;
    }
    T getRole() {
        return role;
    }
}

public class ResumeScreening {
    static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening: " + role);
        }
    }

    public static void main(String[] args) {
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer());
        resumes.add(new DataScientist());
        screenResumes(resumes);
    }
}