package week6_problem1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Unit comp = new Unit("UINH 1314", "Computing");

        //test students
        comp.addStudent(new Student(1, "Charlie", "Chalmers", "07500 364618", "pass"));
        comp.addStudent(new Student(2, "Joseph", "Sweeney", "07500 421421", "fail"));
        String userChoice;

        do {

            System.out.println("\n1. Add Student\n2. Show all students\n3. Display specific"
                    + " student\n4. Display students who passed\n5. Display percentage" +
                    " success rate\n6. Remove student\n7. Exit\n");

            userChoice = reader.nextLine();

            switch(userChoice){
                case "1":
                    comp.addStudent();
                    break;
                case "2":
                    System.out.println("Chose 2.");
                    comp.displayStudents();
                    break;
                case "3":
                    System.out.println("Chose 3.");
                    System.out.print("Student number: ");
                    int number = Integer.parseInt(reader.nextLine());
                    for(Student student : comp.getClassList()){
                        if(student.getNumber() == number){
                            System.out.println(student);
                        }
                    }
                    break;
                case "4":
                    System.out.println("Chose 4.");
                    // display passed students
                    comp.displayPassed();
                    break;
                case "5":
                    System.out.println("Chose 5.");
                    // *** display the percentage pass rate ***
                    System.out.println(comp.calcPercentagePassed());
                    break;
                case "6":
                    System.out.println("Chose 6.");
                    comp.removeStudent();
                    break;
                default:
                    System.out.println("Please enter a valid number.");
                    break;
            }
        } while (!userChoice.equals("7"));
    }
}
