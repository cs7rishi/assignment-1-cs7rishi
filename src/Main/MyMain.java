package Main;
import Person.Person;
import Function.Function;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        Function f = new Function();
        int c = 1;
        while (c == 1) {
            System.out.println("Welcome to Sam's Contact List App");
            System.out.println();
            System.out.println("Press 1 to add a new contact");
            System.out.println("Press 2 to view all contacts");
            System.out.println("Press 3 to search for a contact");
            System.out.println("Press 4 to delete a contact");
            System.out.println("Press 5 to exit program");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();
            while (ch > 5) {
                System.out.println("Enter again : ");
                ch = sc.nextInt();
            }
            switch (ch) {
                case 1:
                    f.insert();
                    break;
                case 2:
                    f.view();
                    break;
            case 3:
                f.search();
            break;
            case 4:f.view();
                System.out.println("Enter index : ");
                int a = sc.nextInt();
                f.delete(a);
            break;
                case 5:
                    c = 0;
                    System.out.println("Exiting Application...");
                    break;
                default:
                    System.out.println("Invalid Choice...");
                    ;

            }
        }
    }

}