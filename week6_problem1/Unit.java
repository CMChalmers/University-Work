package week6_problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class Unit {
    private String unitCode;
    private String unitTitle;
    private ArrayList<Student> classList;

    public Unit(String uCode, String uTitle){
        this.unitCode = uCode;
        this.unitTitle = uTitle;
        this.classList = new ArrayList();
    }

    public ArrayList<Student> getClassList(){
        return this.classList;
    }

    public void addStudent(){
        this.classList.add(new Student());
    }

    public void addStudent(Student student){
        this.classList.add(student);
    }

    public void removeStudent(){
        ArrayList<Student> toBeRemoved = new ArrayList();
        System.out.println("Student to removes ID: ");
        Scanner reader = new Scanner(System.in);
        int id = Integer.parseInt(reader.nextLine());
        for(Student student : this.classList){
            if(student.getNumber() == id){
                toBeRemoved.add(student);
            }
        }
        this.classList.remove(toBeRemoved.get(0));
    }

    public void displayStudents(){
        for(Student item : this.classList){
            System.out.println(item);
        }
    }

    public void displayStudents(Student temp){
        int index = this.classList.indexOf(temp);
        System.out.println(this.classList.get(index));
    }

    public void displayPassed(){
        for(Student item : this.classList){
            if(item.checkIfPassed() == true){
                System.out.println(item);
            }
        }
    }

    public String calcPercentagePassed(){
        double counter = 0;
        double students = 0;

        for(Student item : this.classList){
            if(item.checkIfPassed() == true){
                counter++;
            }
            students++;
        }
        double percentage = (counter / students) * 100;
        return percentage + "% passed";
    }
}
