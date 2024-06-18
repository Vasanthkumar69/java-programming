import java.util.Scanner;

class StudentMarkSheet {
    String courseName;
    String courseCode;
    int marksObtained;
    char grade;

    public StudentMarkSheet(String courseName, String courseCode, int marksObtained) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.marksObtained = marksObtained;
        this.grade = calculateGrade(marksObtained);
    }

    private char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'S';
        } else if (marks >= 80) {
            return 'A';
        } else if (marks >= 70) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 50) {
            return 'D';
        } else {
            return 'F'; // Assuming F for marks below 50
        }
    }

    public void displayMarkSheet() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Marks Obtained: " + marksObtained);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter course code: ");
        String courseCode = scanner.nextLine();
        System.out.print("Enter marks obtained: ");
        int marksObtained = scanner.nextInt();

        StudentMarkSheet markSheet = new StudentMarkSheet(courseName, courseCode, marksObtained);
        markSheet.displayMarkSheet();

        scanner.close();
    }
}
