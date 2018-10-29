package week6_problem2;

import java.util.Scanner;

public class Person {
    private String forename;
    private String surname;
    private String phoneNo;
    private Scanner reader = new Scanner(System.in);

    public Person(){
        System.out.println("ADD NEW: \n");
        setForename();
        setSurname();
        setPhoneNo();
    }

    public Person(String cForename, String cSurname, String cPhoneNo){
        this.forename = cForename;
        this.surname = cSurname;
        this.phoneNo = cPhoneNo;
    }

    public Person(String cForename, String cSurname){
        this.forename = cForename;
        this.surname = cSurname;
    }

    public void setForename(){
        System.out.print("Forename: ");
        String userInput = reader.nextLine();
        this.forename = userInput;
    }

    public void setForename(String mForename){
        this.forename = mForename;
    }

    public String getForename(){
        return this.forename;
    }

    public void setSurname(){
        System.out.print("Surname: ");
        String userInput = reader.nextLine();
        this.surname = userInput;
    }

    public void setSurname(String mSurname){
        this.surname = mSurname;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setPhoneNo(){
        System.out.print("Phone No: ");
        String userInput = reader.nextLine();
        this.phoneNo = userInput;
    }

    public void setPhoneNo(String mPhoneNo){
        this.phoneNo = mPhoneNo;
    }

    public String getPhoneNo(){
        return this.phoneNo;
    }

    public String getMemberType(){
        return "Not a member.";
    }

    public String toString(){
        return "Name: " + getForename() + " " + getSurname() + ", Phone No: " + getPhoneNo();
    }
}
