package AdminModule;

import Classes.Patient;
import Classes.Doctor;

import java.util.Scanner;

public class Main {
    static void home(){
        Scanner in = new Scanner(System.in);
        Admin admin = new Admin();
        int option;
        do{
            Admin.template();
            System.out.println("      1. Login as Admin");
            System.out.println("      2. Exit");
            System.out.print("\n  Choose an option: ");
            option = in.nextInt();
            switch (option){
                case 1:
                    admin.validLogin();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Choose an correct option.");
                    break;
            }
        }while ((option != 2));
    }

    public static void main(String[] args) {
        //for pre add
        //Patient.patients.add(new Patient(name, contact, age, reason));
        //Doctor.doctors.add(new Doctor(name, contact, specialist, qualification));
        Main.home();
    }
}