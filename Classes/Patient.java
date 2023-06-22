package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Patient extends Person{

    Scanner in = new Scanner(System.in);

    int age;
    String reason;

    public static ArrayList<Patient> patients = new ArrayList<>();
    public Patient(String name, String contact, int age, String reason) {
        super(name, contact);
        this.age = age;
        this.reason = reason;
    }

    public static void showPatient(){
        System.out.println("Patients List: ");
        System.out.println("  |  ID  |  Name  |  ContactNo.  |  Age  |  ReasonForAdmission  |  ");
        for(Patient i : patients){
            if(i.status == "Active") {
                System.out.println("  |  " + i.id + "  |  " + i.name + "  |  " +
                        i.contact + "  |  " + i.age + "  |  " + i.reason);
            }
        }
    }

    public static void addPatient(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter patient's name : ");
        String name = in.nextLine();
        in.nextLine();
        System.out.print("Enter patient's contactNo. : ");
        String contact = in.nextLine();
        in.nextLine();
        System.out.print("Enter patient's age : ");
        int age = in.nextInt();
        in.nextLine();
        System.out.print("Enter student's reason for admission : ");
        String reason = in.nextLine();
        in.nextLine();
        patients.add(new Patient(name, contact, age, reason));
        System.out.println("Patient added successfully.");
    }

    public static void removePatient(){
        Scanner in = new Scanner(System.in);
        showPatient();
        System.out.print("\nEnter patient Id : ");
        int id = in.nextInt();
        in.nextLine();
        Patient patient = patients.get(id);
        patient.status = "Inactive";
        System.out.println("Patient removed successfully.");
    }
    @Override
    public void show() {
        showPatient();
    }

    @Override
    public void add() {
        addPatient();
    }

    @Override
    public void remove() {
        removePatient();
    }
}
