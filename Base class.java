// Base class
class Student {
    String name;
    int[] marks = new int[6];

    public Student(String name, int[] marks) {
        this.name = name;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }
}

// Derived class
class Grade extends Student {
    int totalMarks;
    double aggregate;
    String gradeDivision;

    public Grade(String name, int[] marks) {
        super(name, marks);
        calculateTotalAndAggregate();
        determineGradeDivision();
    }

    private void calculateTotalAndAggregate() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        aggregate = (double) totalMarks / marks.length;
    }

    private void determineGradeDivision() {
        if (aggregate >= 75) {
            gradeDivision = "Distinction";
        } else if (aggregate >= 60) {
            gradeDivision = "First Division";
        } else if (aggregate >= 50) {
            gradeDivision = "Second Division";
        } else if (aggregate >= 40) {
            gradeDivision = "Third Division";
        } else {
            gradeDivision = "Fail";
        }
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Aggregate: " + aggregate + "%");
        System.out.println("Grade Division: " + gradeDivision);
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        // Example usage
        String studentName = "John Doe";
        int[] studentMarks = {85, 78, 92, 67, 88, 75}; // Example marks

        Grade studentGrade = new Grade(studentName, studentMarks);
        studentGrade.displayResult();
    }
}
