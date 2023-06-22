package AdminModule;

import Classes.Doctor;
import Classes.Patient;

import java.util.Scanner;

public class Admin {
     String userName = "admin";
     String password = "admin";

    Scanner in = new Scanner(System.in);

    static void template(){
        System.out.println("\n------------------------------------------------------------------------------------------------------------------");
        System.out.println("|                                      Care Hospital Limited                                         |");
        System.out.println("------------------------------------------------------------------------------------------------------------------\n");
    }

     void validLogin(){
         System.out.print("Enter admin username: ");
         String userName = in.nextLine();
         in.nextLine();
         System.out.print("Enter admin password: ");
         String password = in.nextLine();
         in.nextLine();
         menu();
     }
     void menu() {
        int option;
        do{
            template();
            System.out.println("  *** Admin Section ***");
            System.out.println("      1. Show");
            System.out.println("      2. Add");
            System.out.println("      3. Remove");
            System.out.println("      4. Logout");
            System.out.print("\n  Choose an option: ");
            option = in.nextInt();
            switch (option) {
                case 1:
                    int option1;
                    do{
                        System.out.println("\n-------------------------------\n");
                        System.out.println("      1. Show Patient");
                        System.out.println("      2. Show Doctor");
                        System.out.println("      3. Back");
                        System.out.print("\n  Choose an option: ");
                        option1 =in.nextInt();
                        switch (option1) {
                            case 1:
                                Patient.showPatient();
                                break;
                            case 2:
                                Doctor.showDoctor();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.print("Choose an correct option: ");
                                break;
                        }
                    }while( option1 != 3 );
                    break;
                case 2:

                    int option2;
                    do{
                        System.out.println("\n-------------------------------\n");
                        System.out.println("      1. Add Patient");
                        System.out.println("      2. Add Doctor");
                        System.out.println("      3. Back");
                        System.out.print("\n  Choose an option: ");
                        option2 =in.nextInt();
                        switch (option2) {
                            case 1:
                                Patient.addPatient();
                                break;
                            case 2:
                                Doctor.addDoctor();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.print("Choose an correct option: ");
                                break;
                        }
                    }while( option2 != 3 );
                    break;
                case 3:
                    int option3;
                    do{
                        System.out.println("\n-------------------------------\n");
                        System.out.println("      1. Remove Patient");
                        System.out.println("      2. Remove Doctor");
                        System.out.println("      3. Back");
                        System.out.print("\n  Choose an option: ");
                        option3 =in.nextInt();
                        switch (option3) {
                            case 1:
                                Patient.removePatient();
                                break;
                            case 2:
                                Doctor.removeDoctor();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.print("Choose an correct option: ");
                                break;
                        }
                    }while( option3 != 3 );
                    break;
                case 4:
                    break;
                default:
                    System.out.print("Choose an correct option: ");
                    break;
            }
        }while ( option != 4);
    }
    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
