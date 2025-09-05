import java.util.Scanner;
import java.util.ArrayList;
//TASK 2 : ADDING STUDENTS TO AN ARRAY
//student class
class Student{ //task1
    private int roll_num;
    private String name;
    private String course;
    private int marks;
    private String grade;

    //constructor
    public Student(int roll_num, String name, String course, int marks , String grade){
        this.roll_num = roll_num;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.grade = "Not calculated yet" ;//default
    }

    //to calculate the grade 

    public void calculate_grade(){
        if(marks>=90){
            grade = "A";
        } else if (marks >= 75){
            grade = "B";
        } else if (marks >=60){
            grade = "C";
        } else if (marks >=50){
            grade = "D";
        } else {
            grade = "F";
        }
    }

    //to display the student details
    public void student_details(){
        System.out.println("Roll number : " + roll_num);
        System.out.println("Name : " + name);
        System.out.println("Course name : " + course);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);
        System.out.println("-------------------------------------");
    }
}

//main class
public class task2 { //task3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter the number of students : ");
        int n = sc.nextInt();
        sc.nextLine();//newline

        for(int i= 0 ; i<n ; i++){ //task2 with loop
            System.out.println("Enter the details ; "+ (i+1) + ":");

            System.out.println("Roll Number : ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.println("Name : ");
            String name = sc.nextLine();

            System.out.println("Course : ");
            String course = sc.nextLine();


            System.out.println("Marks : ");
            int marks = sc.nextInt();
            sc.nextLine();

            Student student = new Student(roll, name, course, marks, "not calculated yet");
            student.calculate_grade();
            students.add(student); // <-- Add this line
            System.out.println();
        }

        //display the details
        System.out.println("\n------Student Records-------\n");
        for (Student s : students){
            s.student_details();
        }

        sc.close();

    }
}

