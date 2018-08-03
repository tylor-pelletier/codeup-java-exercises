package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {

        this.name = name;
        grades = new ArrayList<>();

    }


    public String getName() {

        return this.name;

    }

    public String getGrades() {

        return this.grades.toString();

    }

    public void addGrade(double grade) {

        grades.add(grade);

    }

    public double getGradeAverage() {

        double totalGrade = 0;

        for (double grade : grades) {

            totalGrade += grade;

        }

//          FOR LOOP
//        for (int i = 0; i < grades.size(); i += 1) {
//
//            totalGrade += grades.get(i);
//
//        }

        double averageGrade = totalGrade / grades.size();
        return averageGrade;

    }

    public static void main(String[] args) {

        Student studentOne = new Student("Tylor");
        studentOne.addGrade(99.7);
        studentOne.addGrade(98.5);
        studentOne.addGrade(97.8);
        studentOne.addGrade(95.3);
        System.out.println("Student name: " + studentOne.name);
        System.out.println("Student's grades: " + studentOne.grades);
        System.out.println("Student's grade average: " + studentOne.getGradeAverage());

    }

}