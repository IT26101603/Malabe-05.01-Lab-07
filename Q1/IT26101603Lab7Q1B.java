import java.util.Scanner;

public class IT26101603Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.print("Enter marks for student " + student + ": ");

            double total = 0;

            for (int subject = 1; subject <= 4; subject++) {
                total += input.nextDouble();
            }

            double average = total / 4;

            if (average >= 75)
                System.out.println("Grade = Distinction");
            else if (average >= 50)
                System.out.println("Grade = Credit");
            else
                System.out.println("Grade = Fail");
        }
    }
}