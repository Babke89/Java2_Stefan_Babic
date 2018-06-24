package student;

import computer.Computer;
import course.Course;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;

     public Student() {
        this.firstName = "not defined";
        this.lastName = "not defined";
        this.yearOfBirth = 0;
        this.course = new Course();
        this.computer = new Computer();

    }

    public Student(String firstName, String lastName, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.course = new Course();
        this.computer = new Computer();
    }

    public Student(String firstName, String lastName, int yearOfBirth, Course course, Computer computer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.course = course;
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void info() {
        System.out.println("First name : " + getFirstName());
        System.out.println("Last name : " + getLastName());
        System.out.println("Year of birth : " + getYearOfBirth());
        
        System.out.println("Computer, computer hardrive: " + getComputer().getHardDrive());
        System.out.println("Computer, memory: " + getComputer().getMemory());
        System.out.println("Computer, processor tact : " + getComputer().getProcessTact());
        
        System.out.println("Course, name : " + getCourse().getName());
        System.out.println("Course, number of classes : " + getCourse().getNumberOfClasses() );
        
        
    }

}
