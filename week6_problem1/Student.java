package week6_problem1;

import java.util.Scanner;

public class Student {
    private int number;
    private String forename;
    private String surname;
    private String mobileNo;
    private String result;

    public Student(int num, String forename, String surname, String mobileNo, String result){
        this.number = num;
        this.forename = forename;
        this.surname = surname;
        this.mobileNo = mobileNo;
        this.result = result;
    }

    public Student(int num, String forename, String surname, String mobileNo){
        this.number = num;
        this.forename = forename;
        this.surname = surname;
        this.mobileNo = mobileNo;
    }

    public Student(){
        this.number = setNumber();
        this.forename = setForename();
        this.surname = setSurname();
        this.mobileNo = setMobileNo();
        this.result = setResult();
    }

    public void setResult(String result){
        this.result = result;
    }

    public String setResult(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter students result: ");
        String input = reader.nextLine();
        return input;
    }

    public int setNumber(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter students ID number: ");
        int input = Integer.parseInt(reader.nextLine());
        return input;
    }

    public int getNumber(){
        return this.number;
    }

    public String setForename(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter students forename: ");
        String input = reader.nextLine();
        return input;
    }

    public String setSurname(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter students surname: ");
        String input = reader.nextLine();
        return input;
    }

    public String setMobileNo(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter students mobile number: ");
        String input = reader.nextLine();
        return input;
    }

    public String toString(){
        return this.number + ", " + this.forename + " " + this.surname + ", " + this.mobileNo + ", " + this.result;
    }

    public boolean checkIfPassed(){
        if(this.result.equalsIgnoreCase("pass")){
            return true;
        }
        return false;
    }
}
