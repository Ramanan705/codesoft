import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of Subjects: ");
        int numberOfSubjects = in.nextInt();
        System.out.println(numberOfSubjects);
        int totalMarks = 0;
        int marks;
        for (int i = 0; i < numberOfSubjects; i++) {
        marks = in.nextInt();
        while (marks < 0 || marks > 100) 
        {
            marks = in.nextInt();
        }
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else if (averagePercentage >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }
        System.out.println("Total Marks: " + totalMarks );
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}
