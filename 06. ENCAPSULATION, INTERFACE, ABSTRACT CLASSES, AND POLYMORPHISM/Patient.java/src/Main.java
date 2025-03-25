import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private List<String> medicalHistory;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = new ArrayList<>();
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected List<String> getMedicalHistory() {
        return medicalHistory;
    }

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private int numberOfDays;
    private double dailyRate;
    private List<String> records;

    public InPatient(String patientId, String name, int age, String diagnosis, int numberOfDays, double dailyRate) {
        super(patientId, name, age, diagnosis);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return numberOfDays * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
        getMedicalHistory().add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
        this.records = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
        getMedicalHistory().add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for (String r : records) {
            System.out.println("- " + r);
        }
    }
}

class HospitalPatientManagement {

    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        if (patient instanceof MedicalRecord) {
            System.out.println("Bill: ₹" + patient.calculateBill());
            ((MedicalRecord) patient).viewRecords();
        }
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        InPatient inPatient = new InPatient("IP001", "Aarav Mehta", 45, "Fracture", 5, 2000);
        inPatient.addRecord("Admitted to Room 301");
        inPatient.addRecord("X-Ray and Surgery completed");

        OutPatient outPatient = new OutPatient("OP002", "Neha Sharma", 29, "Fever", 500);
        outPatient.addRecord("Consulted by Dr. Rao");
        outPatient.addRecord("Prescribed antibiotics");

        processPatient(inPatient);
        processPatient(outPatient);
    }
}
