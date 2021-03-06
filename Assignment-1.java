//Q1.What is compiler and Interpreter?

//Ans:A compiler is a program that reads a program written in the high-level language and converts it into the machine or low-level language and reports the errors present in the program. It converts the entire source code in one go or could take multiple passes to do so, but at last, the user gets the compiled code which is ready to execute. 
//  The interpreter is an alternative for and does the same work as a compiler but interpreter processes directly to execute statement rather than generating code from the syntax tree so An interpreter may require processing the same syntax tree more than once that is the reason why interpretation is comparatively slower than executing the compiled program.



//Q2.Define a class Student with following members:
//int roll, String name, float marks.
//input() to take input of the details
//display() to all details of a student.
//Write a program to which will store details of a student and print the details using the above

//Ans:
import java.util.Scanner;
public class Student
{
    private String name;
    private int roll;
    private float marks;
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter roll no. of student: ");
        roll = in.nextInt();
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter the marks of student: ");
        marks = in.nextFloat();
    }        
    public void display() {
        System.out.println("Roll no: " + roll);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
    }    
    public static void main(String args[]) {
        Student obj = new Student();
        obj.input();
        obj.display();
    }
}
