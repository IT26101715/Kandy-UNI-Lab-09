import java.util.Scanner;

public class IT26101715Lab9Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name for student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark: ");
            double assMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            double examMark = input.nextDouble();
            input.nextLine(); 

            finalMarks[i] = calcFinalMark(assMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println();
        }

        System.out.println("Name\tFinal Mark\tGrade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }

    public static double calcFinalMark(double assMark, double examMark) {
        return (assMark * 0.30) + (examMark * 0.70);
    }

    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } else if (mark >= 60) {
            return 'B';
        } else if (mark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + "\t" + finalMark + "\t\t" + grade);
    }
}