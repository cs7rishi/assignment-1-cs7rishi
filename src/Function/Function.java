package Function;
import Person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Function {
    Scanner sc = new Scanner(System.in);
    Person obj = new Person();
    ArrayList<Person> perArr = new ArrayList<>();
    int i=0;

    public void insert() {
            Person p = new Person();
            System.out.println("Enter name");
            System.out.println("First name : ");
            String fn = sc.nextLine();
            p.setFname(fn);
            System.out.println("Last name : ");
            String ln = sc.nextLine();
            p.setLname(ln);
            System.out.println("Contact number : ");
            String n = sc.nextLine();
            p.setPhone(n);
            System.out.println("Would you like to add another contact number? (y/n):");
            String ch = sc.nextLine();
            if (ch.compareTo("y")==0) {
                System.out.println("Contact Number  :");
                n = sc.nextLine();
                p.setPhone(n);
            }
            System.out.println("Would you like to add email address? (y/n):");
            String ch1 = sc.nextLine();
            if (ch1.compareTo("y")==0) {
                System.out.println("Email id : ");
                String id = sc.nextLine();
                String regx = "\\w+@\\w+.\\w{2,}";
                while(Pattern.compile(regx).matcher(id).matches()!=true){
                    System.out.println("Invalid ");
                    System.out.println("Enter again : ");
                    id = sc.nextLine();
                }
                p.setEmail(id);
            }
            perArr.add(i,p);
            i=i+1;
        }

        public void sort(){
        Collections.sort(perArr);
        }
        public void delete(int index){
            perArr.remove(index-1);
        view();
        }
        public void search(){
            System.out.println("Enter First name : ");
            String s = sc.nextLine();
            for(int i=0;i<perArr.size();i++){
                if(s.equals(perArr.get(i).getFname())){
                    System.out.println("1 Record Found");
                    System.out.println();
                    System.out.println(perArr.get(i));
                }
            }
        }

    public void view(){
        sort();
        for(Person ele : perArr){
            System.out.println(ele);
            System.out.println();
        }
    }
}