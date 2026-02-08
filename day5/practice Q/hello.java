import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // System.out.println("hello");

        // PROBLEM1 AVG MARKS AND PERCENTAGE CALCULATOR*************************

        // byte m1, m2, m3;
        // Scanner sc = new Scanner(System.in);

        // System.out.println("enter marks of m1: ");
        // m1 = sc.nextByte();

        // System.out.println("enter marks of m2: ");
        // m2 = sc.nextByte();

        // System.out.println("enter marks of m3:");
        // m3 = sc.nextByte();

        // float avg = (m1 + m2 + m3) / 3.0f;

        // if (avg >= 33 && m2 >= 33 && m3 >= 33) {
        // System.out.println("pass");
        // } else {
        // System.out.println("fail");
        // }
        // System.out.println("your average is: " + avg);
        // System.out.println("your percentage is: " + (avg * 100 / 100));
        // System.out.println("your marks are: " + m1 + " " + m2 + " " + m3);

        // PROBLEM 2 INCOME TAX CALCULATOR *********************************************

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter your income in lakhs:");
        // float tax = 0;
        // float income = sc.nextFloat();

        // if (income <= 2.5) {
        // tax = 0;

        // } else if (income > 2.5f && income < 5.0f) {
        // tax = 0.5f * (income - 2.5f);

        // } else if (income > 5.0f && income < 10.0f) {
        // tax = tax + 0.5f * (5.0f - 2.5f);
        // tax = tax + 0.20f * (income - 5.0f);

        // } else if (income > 10.0f) {
        // tax = tax + 0.5f * (5.0f - 2.5f);
        // tax = tax + 0.20f * (10.0f - 5.0f);
        // tax = tax + 0.30f * (income - 10.0f);

        // }
        // System.out.println("total tax paid by the emplayee is: " + tax + " lakhs");

        // problem3 LEAP YEAR********************************************

        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter year:");
        // int year = sc.nextInt();
        // if (year % 4 == 0) {
        // System.out.println("leap year");
        // } else {
        // System.out.println("not a leap year");
        // }

        // problem4 WEBSITE ORIGIN
        // CHECKER***********************************************
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your website:");
        String website = sc.next();
        if (website.endsWith(".com")) {
            System.out.println("this is a commercial website");
        } else if (website.endsWith(".org")) {
            System.out.println("this is an organizational website");
        } else if (website.endsWith(".in")) {
            System.out.println("this is an indian website");
        } else {
            System.out.println("unknown website");
        }

        sc.close();
    }
}