package com.company;

public class EmployeeWageBuilder {
    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    public static void main(String[] args) {
        computeEmpWage("Dmart", 20, 2, 10);
        computeEmpWage("Inorbit", 45, 2, 9);
    }

    public static void computeEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHourPerMonth) {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHourPerMonth &&
                totalWorkingDays < numOfWorkingDays) {
            {
                totalWorkingDays++;  //it will increment till 20
                int empCheck = ((int) Math.floor(Math.random() * 10) % 3);  // random value between 0,1,2 which will take u to switch case
                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                    case IS_PART_TIME:
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0; // 0
                }
                totalEmpHrs += empHrs; // it depends on empCheck value
                System.out.println("Days#: " + totalWorkingDays + "     Emp Hr: " + empHrs);

            }
            int totalEmpWage = totalEmpHrs * empRatePerHr;
            System.out.println("Total Emp Wage for a company: " + company + " is: " + totalEmpWage);
             }


    }
}

