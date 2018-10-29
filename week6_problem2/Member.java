package week6_problem2;

import java.util.Scanner;

public class Member extends Person {
    private String memberNo;
    private String memberType;
    private Scanner reader = new Scanner(System.in);

    public Member(){
        super();
        setMemberNo();
        setMemberType();
    }

    public Member(String cForename, String cSurname, String cPhoneNo, String cMemberNo, String cMemberType){
        super(cForename, cSurname, cPhoneNo);
        this.memberNo = cMemberNo;
        this.memberType = cMemberType;
    }

    public String getMemberNo(){
        return this.memberNo;
    }

    public void setMemberNo(){
        System.out.print("Member No: ");
        String userInput = reader.nextLine();
        this.memberNo = userInput;
    }

    public String getMemberType(){
        return this.memberType;
    }

    public void setMemberType(){
        System.out.println("Please choose 'Gold', 'Silver' or 'Bronze'");
        System.out.print("Member Type: ");
        String userInput = reader.nextLine();
        this.memberType = userInput;
    }

    public String toString(){
        return super.toString() + ", MemberNo: " + this.getMemberNo() + ", Member Type: " + this.getMemberType();
    }
}
