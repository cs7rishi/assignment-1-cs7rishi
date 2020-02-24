package Person;

import java.util.ArrayList;

public class Person implements Comparable<Person>{
    private String fname;
    private String lname;
    private ArrayList<String> phonenumber = new ArrayList<>();
    private String email;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }



    public void setPhone(String phone) {
        phonenumber.add(phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString()
    {
        String s="";
        s+=("-------- * -------- * -------- * --------");
        s+=("\nFirst Name: "+fname);
        s+=("\nLast Name: "+lname);
        if(phonenumber.size()>1)
        {
            s+=("\nContact Number(s): ");
            for(int i=0;i<phonenumber.size();i++)
            {
                if(i==0)
                    s+=(""+phonenumber.get(i));
                else
                    s+=(", "+phonenumber.get(i));
            }
        }
        else
        {
            s+=("\nContact Number: ");
            s+=(phonenumber.get(0));
        }
        s+=("\nEmail Address: "+email);
        s+=("\n-------- * -------- * -------- * --------");
        return s;
    }

    @Override
    public int compareTo(Person p) {
        return this.getFname().compareTo(p.getFname());
    }
}