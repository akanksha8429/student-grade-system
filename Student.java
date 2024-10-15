import java.util.HashMap;

import java.util.Map;


public class Student {

    private String name;

    private String id;

    private Map<String, Double> grades;
 // Subject -> Grade


    // Constructor

    public Student(String id, String name) {

        this.id = id;
 
       this.name = name;
 
       this.grades = new HashMap<>();

    }


    // Add a grade for a subject

    public void addGrade(String subject, double grade) {

        grades.put(subject, grade);

    }


    // Get GPA (average of all grades)

    public double calculateGPA() {

        if (grades.isEmpty()) {

            return 0.0;

        }

        double sum = 0.0;

        for (double grade : grades.values()) {

            sum += grade;
 
       }
 
       return sum / grades.size();

    }


    // Display student information and grades

    public void displayStudentInfo() {

        System.out.println("Student ID: " + id);

        System.out.println("Name: " + name);

        System.out.println("Grades:");

        for (Map.Entry<String, Double> entry : grades.entrySet()) {

            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
 
       }

        System.out.println("GPA: " + String.format("%.2f", calculateGPA()));

    }


    // Getters
 
   public String getId() {


        return id;

    }


    public String getName() {

        return name;

    }

}