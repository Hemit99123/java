/*
Problem Statement:
A city has 3 maintenance services that operate on fixed schedules:

Service A happens every a years.

Service B happens every b years.

Service C happens every c years.

All 3 services start in year 0. Your task is to determine in which year all 3 services will occur in the same year again.

Input:
Three positive integers a, b, and c (the intervals for each service).

Output:
A single integer representing the first year (greater than 0) when all 3 services coincide.
*/

import java.util.Scanner;

public class Services {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter service A occurrence: ");
        int a = sc.nextInt();

        System.out.print("Enter service B occurrence: ");
        int b = sc.nextInt();

        System.out.print("Enter service C occurrence: ");
        int c = sc.nextInt();

        int year = 1;

        // loop until divisible by all three
        while (year % a != 0 || year % b != 0 || year % c != 0) {
            year++;
        }

        System.out.println("All services coincide in year: " + year);
    }
}
