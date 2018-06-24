package main;

import computer.Computer;
import course.Course;
import student.Student;

public class Main {

  
    public static void main(String[] args) {
        
        
        Student studentMilomir = new Student();
        studentMilomir.info();
        
        
        Student student2 = new Student("Marko", "Markovic", 1976);
        student2.info();
    
        Course courseQA = new Course("QA kurs", 15);
        courseQA.info();
        
        Computer computer1 = new Computer(3.4, 8, 250);
        computer1.info();
        
        Student student3 = new Student("Petar", "Jezdić", 1980, courseQA, computer1);
        student3.info();
        
    }
    
}
