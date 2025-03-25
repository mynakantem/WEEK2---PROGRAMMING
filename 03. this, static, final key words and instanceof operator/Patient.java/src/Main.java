class Patient {
    static String hospitalName = "CityCare Hospital";
    static int totalPatients = 0;

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Patient Details:");
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("-------------------------------");
        }
    }
}

class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to " + Patient.hospitalName);
        System.out.println("-------------------------------");

        Patient p1 = new Patient(101, "Alice", 30, "Fever");
        Patient p2 = new Patient(102, "Bob", 45, "Diabetes");
        Patient p3 = new Patient(103, "Charlie", 25, "Fracture");
        p1.displayPatientDetails();
        p2.displayPatientDetails();
        p3.displayPatientDetails();

        Patient.getTotalPatients();
    }
}
