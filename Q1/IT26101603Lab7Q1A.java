import java.util.Scanner;

public class IT26101603Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            total += input.nextDouble();
        }

        double average = total / 4;

        System.out.println("Average = " + average);

        if (average >= 75)
            System.out.println("Grade = Distinction");
        else if (average >= 50)
            System.out.println("Grade = Credit");
        else
            System.out.println("Grade = Fail");
    }
}