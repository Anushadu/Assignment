import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        char grade;

        System.out.print("Enter your score (0-100): ");
        score = scanner.nextInt();

        switch(score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            
            default:
                grade = 'F';
                break;
        }

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}
