import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;


public class GradeTracker {

    private Map<String, Student> students;

    private Scanner scanner;


    // Constructor

    public GradeTracker() {

        this.students = new HashMap<>();

        this.scanner = new Scanner(System.in);

    }


    // Add a new student
 
   public void addStudent(String id, String name) {

        if (students.containsKey(id)) {

            System.out.println("Student with this ID already exists!");

        }
 else {

            Student student = new Student(id, name);

            students.put(id, student);

            System.out.println("Student added successfully!");

        }

    }


    // Update a student's grade

    public void updateGrade(String id, String subject, double grade) {

        Student student = students.get(id);

        if (student != null) {

            student.addGrade(subject, grade);

            System.out.println("Grade updated successfully.");

        } 
else {

            System.out.println("Student not found!");

        }

    }


    // Display student details

    public void displayStudent(String id) {

        Student student = students.get(id);

        if (student != null) {
 
           student.displayStudentInfo();

        } else {

            System.out.println("Student not found!");
 
       }

    }

  
  // List all students

    public void listAllStudents() {
 
       if (students.isEmpty()) {
 
           System.out.println("No students available.");

        } 
else {

            for (Student student : students.values()) {

                student.displayStudentInfo();
 
               System.out.println("----------------------------");

            }

        }

    }


    // Menu system

    public void showMenu() {
 
       while (true) {

            System.out.println("\n--- Student Grade Tracker ---");
 
           System.out.println("1. Add Student");
 
           System.out.println("2. Update Student Grade");

            System.out.println("3. Display Student Information");

            System.out.println("4. List All Students");

            System.out.println("5. Exit");

            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
 
           scanner.nextLine();
 // Consume newline

 
           switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
 
                   String id = scanner.nextLine();

                    System.out.print("Enter Student Name: ");

                    String name = scanner.nextLine();

                    addStudent(id, name);

                    break;

                case 2:
 
                   System.out.print("Enter Student ID: ");

                    String updateId = scanner.nextLine();

                    System.out.print("Enter Subject: ");

                    String subject = scanner.nextLine();

                    System.out.print("Enter Grade: ");

                    double grade = scanner.nextDouble();

                    updateGrade(updateId, subject, grade);

                    break;
  
              case 3:
   
                 System.out.print("Enter Student ID: ");
   
                 String displayId = scanner.nextLine();
 
                   displayStudent(displayId);
  
                  break;

                case 4:
 
                   listAllStudents();

                    break;

                case 5:

                    System.out.println("Exiting...");
 
                   return;
 
               default:
   
                 System.out.println("Invalid choice! Please try again.");
 
           }

        }
 
   }

}