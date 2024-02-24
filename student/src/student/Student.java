/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author ompowale
 */
public class Student {
    int studentID;
    String name;
    double percentage;
    int yearOfPassing;
    Student()
    {
        System.out.println("NO CONSTRUTOR");
    }
    Student(int studentID)
    {
        this.studentID=studentID;
    }
    Student(int studentID,String name)
    {
        this.studentID=studentID;
        this.name=name;
    }
    Student(int studentID,String name,double percentage)
    {
        this.studentID=studentID;
        this.name=name;
        this.percentage=percentage;
    }
    Student(int studentID,String name,double percentage,int yearOfPassing)
    {
       
         this.studentID=studentID;
        this.name=name;
        this.percentage=percentage;
        this.yearOfPassing=yearOfPassing;
    }
    public void detailOfStudent()
    {
        System.out.println("Student ID:"+studentID);
        System.out.println("Student Name:"+name);
        System.out.println("Student Percentage:"+percentage);
        System.out.println("Year Of Passing:"+yearOfPassing);
        System.out.println("++++++++++++++++++++++");
    }
    public static void main(String[] args) {
       Student student1=new Student();
       student1.detailOfStudent();
       Student student2=new Student(01);
       student2.detailOfStudent();
       Student student3=new Student(01,"om");
       student3.detailOfStudent();
       Student student4=new Student(01,"om",100.00);
       student4.detailOfStudent();
       Student student5=new Student(01,"om",100.00,2023);
       student5.detailOfStudent();
       
    }
    
}
