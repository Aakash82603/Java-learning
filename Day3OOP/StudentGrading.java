package Day3OOP;

import java.util.Scanner;

class Student{
   private String name;
     private int marks;
    private char grade;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;

    }
    void setMarks(int marks){
        if(marks>=0&&marks<=100){
            this.marks=marks;
        }
        else{
            System.out.println("Invalid marks. Marks should be between 0 and 100.");

        }

    }
    int  getMarks(){
        return marks;
    }
    String getName(){
        return name;
    }
    char getGrade(){
        return grade;
    }
    void CalculateGrade(){
        if(marks>=90){
            grade='A';
        }
        else if(marks>80&&marks<90){
            grade='B';
        }
        else if(marks>70&&marks<=80){
            grade='C';
        }
        else if(marks>60&&marks<=70){
            grade='D';
        }
        else{
            grade='F';
        }
    }

}


public class StudentGrading {
    public static void main(String[] args) {
        Student student=new Student("Aakash",50);
            student.CalculateGrade();
            student.setMarks(90);
        student.CalculateGrade();
        System.out.println("Name: "+student.getName());
        System.out.println("Marks: "+student.getMarks());
        System.out.println("Grade: "+student.getGrade());

    }
}
