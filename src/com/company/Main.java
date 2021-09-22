package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


    //getting variables/inputs
    double baseHours = 45.0;
    double basePay = 0.0;
    double extraPay = 0.0;
    double totalPay = 0.0;
    double payAfterTax = 0.0;

    Scanner input = new Scanner(System.in);
    System.out.println("what is the name of the employee?: ");
    String employeeName = input.nextLine();
    System.out.println("how many hours have they worked this week?: ");
    double hoursWorked = input.nextDouble();
    System.out.println("what is their hourly pay?: ");
    double hourlyPay = input.nextDouble();

    if (hoursWorked > 45.0) {
        basePay = 45.0*hourlyPay;
        extraPay = ((hoursWorked - 45.0) * (hourlyPay*1.5));
        totalPay = basePay + extraPay;
    }
    if (hoursWorked >= 0 && hoursWorked < 45) {
        totalPay = hoursWorked * hourlyPay;
    }
    else {
        System.out.println("invalid input");
    }
    payAfterTax = totalPay * 0.8;
    System.out.println("employee name: " + employeeName);
    System.out.println("employee pay before tax: " + totalPay);
    System.out.println("employee pay after tax: " + payAfterTax);
    






    }
}
