package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    static Scanner sc = new Scanner(System.in);
    static String input;
    static String yesNo;

    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {

        Student studentOne = new Student("Riby");
        Student studentTwo = new Student("Skyler");
        Student studentThree = new Student("Angelo");
        Student studentFour = new Student("Tanner");

        studentOne.addGrade(99.0);
        studentOne.addGrade(97.1);
        studentOne.addGrade(86.2);
        studentOne.addGrade(85.3);

        studentTwo.addGrade(94.4);
        studentTwo.addGrade(93.5);
        studentTwo.addGrade(82.6);
        studentTwo.addGrade(81.7);

        studentThree.addGrade(90.8);
        studentThree.addGrade(99.9);
        studentThree.addGrade(88.0);
        studentThree.addGrade(87.1);

        studentFour.addGrade(96.2);
        studentFour.addGrade(95.3);
        studentFour.addGrade(84.4);
        studentFour.addGrade(83.5);

        students.put("rcarter", studentOne);
        students.put("scooley", studentTwo);
        students.put("ahightower", studentThree);
        students.put("tbailey", studentFour);

        System.out.println("Welcome!");
        System.out.println("Here are the github usernames of our students: ");
        System.out.println();
        System.out.println("|rcarter| |scooley| |ahightower| |tbailey| ");
        System.out.println();

        getInformation();

    }

    public static void askToSeeAStudent() {

        System.out.println();
        System.out.println("Would you like to see another student? [y/n]");
        yesNo = sc.next();

        switch (yesNo) {

            case "y":
                getInformation();
                break;
            case "n":
                System.out.println("Goodbye, and have a wonderful day!");
                break;
            default:
                System.out.println("Invalid input, try again");
                askToSeeAStudent();

        }

    }

    public static void getInformation() {

        System.out.println("What student would you like to see more information on?");
        input = sc.next();
        System.out.println();

        switch (input) {

            case "rcarter":
                System.out.println("Name: " + students.get("rcarter").getName() + " - Github Username: rcarter");
                System.out.println("Grades: " + students.get("rcarter").getGrades() + " - Grade Average: " + students.get("rcarter").getGradeAverage());
                askToSeeAStudent();
                break;
            case "scooley":
                System.out.println("Name: " + students.get("scooley").getName() + " - Github Username: scooley");
                System.out.println("Grades: " + students.get("scooley").getGrades() + " - Grade Average: " + students.get("scooley").getGradeAverage());
                askToSeeAStudent();
                break;
            case "ahightower":
                System.out.println("Name: " + students.get("ahightower").getName() + " - Github Username: ahightower");
                System.out.println("Grades: " + students.get("ahightower").getGrades() + " - Grade Average: " + students.get("ahightower").getGradeAverage());
                askToSeeAStudent();
                break;
            case "tbailey":
                System.out.println("Name: " + students.get("tbailey").getName() + " - Github Username: tbailey");
                System.out.println("Grades: " + students.get("tbailey").getGrades() + " - Grade Average: " + students.get("tbailey").getGradeAverage());
                askToSeeAStudent();
                break;
            default:
                System.out.println("Sorry, no student found with the gihub username of \"" + input + "\".");
                askToSeeAStudent();
                break;

        }

    }

}