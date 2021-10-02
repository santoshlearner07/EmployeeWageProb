package com.company;

public class EmployeeWageBuilder {

    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int PER_DAY_WORK_HOUR = 8;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
//        Variables
        int empPerDayIncome = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        int totalIncome = 0;
        while (totalEmpHrs < MAX_HRS_IN_MONTH &&
                totalWorkingDays < NUM_OF_WORKING_DAYS) {
            {
                totalWorkingDays++;  //it will increment till 20
                int empHrs = 0;

                int empCheck = ((int) Math.floor(Math.random() * 10) % 3);  // random value between 0,1,2 which will take u to switch case
                switch (empCheck) {
                    case IS_FULL_TIME:
                        empHrs = 8;
                        empPerDayIncome = PER_DAY_WORK_HOUR * EMP_RATE_PER_HOUR; // 160
                        break;
                    case IS_PART_TIME:
                        empHrs = 4;
                        empPerDayIncome = (PER_DAY_WORK_HOUR * EMP_RATE_PER_HOUR) / 2;  // 80
                        break;
                    default:
                        empHrs = 0; // 0

                }
                totalEmpHrs += empHrs; // it depends on empCheck value
                totalIncome += empPerDayIncome;
                int monthlyIncome = empHrs * totalWorkingDays;

            }
        }
        System.out.println();
        System.out.println("Total Hrs worked in a month :- " + totalEmpHrs + " Hrs");
        System.out.println("Day " + totalWorkingDays + " earned " + totalIncome + " rs");

    }
}