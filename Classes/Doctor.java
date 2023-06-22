package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Person{

    Scanner in = new Scanner(System.in);
    String specialist, qualification;

    public static ArrayList<Doctor> doctors = new ArrayList<>();

    public Doctor(String name, String contact, String specialist, String qualification) {
        super(name, contact);
        this.specialist = specialist;
        this.qualification = qualification;
    }

    public static void showDoctor(){
        System.out.println("Doctors List: ");
        System.out.println("  |  ID  |  Name  |  ContactNo.  |  Specialist  |  Qualification  |  ");
        for(Doctor i : doctors){
            if(i.status == "Active") {
                System.out.println("  |  " + i.id + "  |  " + i.name + "  |  " + i.contact + "  |  " +
                        i.specialist + "  |  " + i.qualification);
            }
        }
    }

    public static void addDoctor(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter doctor's name : ");
        String name = in.nextLine();
        in.nextLine();
        System.out.print("Enter doctor's contactNo. : ");
        String contact = in.nextLine();
        in.nextLine();
        System.out.print("Enter doctor's specialist : ");
        String specialist = in.nextLine();
        in.nextLine();
        System.out.print("Enter doctor's qualification : ");
        String qualification = in.nextLine();
        in.nextLine();
        doctors.add(new Doctor(name, contact, specialist, qualification));
        System.out.println("Doctor added successfully.");
    }

    public static void removeDoctor(){
        Scanner in = new Scanner(System.in);
        showDoctor();
        System.out.print("\nEnter doctor Id : ");
        int id = in.nextInt();
        in.nextLine();
        Doctor doctor = doctors.get(id);
        doctor.status = "Inactive";
        System.out.println("Doctor removed successfully.");
    }
    @Override
    public void show() {
        showDoctor();
    }

    @Override
    public void add() {
        addDoctor();
    }

    @Override
    public void remove() {
        removeDoctor();
    }
}
