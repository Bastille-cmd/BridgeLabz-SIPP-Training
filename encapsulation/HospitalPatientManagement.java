abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String diagnosis);
    String viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private String record;

    public InPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 5000.0;
    }

    public void addRecord(String diagnosis) {
        this.record = diagnosis;
    }

    public String viewRecords() {
        return record;
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String record;

    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 1500.0;
    }

    public void addRecord(String diagnosis) {
        this.record = diagnosis;
    }

    public String viewRecords() {
        return record;
    }
}