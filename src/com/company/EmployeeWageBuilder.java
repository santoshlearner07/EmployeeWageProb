package com.company;

public class EmployeeWageBuilder {
    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkingDays;
    private final int maxHourPerMonth;

    public EmployeeWageBuilder(String company, int empRatePerHr, int numOfWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }


    public static void main(String[] args) {
        EmployeeWageBuilder dMart = new EmployeeWageBuilder("Dmart", 20, 2, 10);
        EmployeeWageBuilder reliance = new EmployeeWageBuilder("Reliance", 45, 2, 9);


//        Variables
        int empPerDayIncome = 0, relEmpPerDayIncome = 0;
        int totalEmpHrs = 0, totalRelEmpHrs = 0;
        int totalWorkingDays = 0, totalRelWorkingDays = 0;
        int totalIncome = 0, totalRelIncome = 0;
        while (totalEmpHrs < dMart.maxHourPerMonth &&
                totalWorkingDays < dMart.numOfWorkingDays) {
            {
                totalWorkingDays++;  //it will increment till 20
                int empHrs = 0;

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
                totalIncome += empPerDayIncome;
                int monthlyIncome = empHrs * dMart.empRatePerHr;

            }
            while (totalRelEmpHrs < reliance.maxHourPerMonth &&
                    totalRelWorkingDays < reliance.numOfWorkingDays) {
                {
                    totalRelWorkingDays++;  //it will increment till 20
                    int rempHrs = 0;

                    int empCheck = ((int) Math.floor(Math.random() * 10) % 3);  // random value between 0,1,2 which will take u to switch case
                    switch (empCheck) {
                        case IS_FULL_TIME:
                            rempHrs = 9;
                            break;
                        case IS_PART_TIME:
                            rempHrs = 5;
                            break;
                        default:
                            rempHrs = 0; // 0

                    }
                    totalRelEmpHrs += rempHrs; // it depends on empCheck value
                    totalRelIncome += relEmpPerDayIncome;
                    int monthlyIncome = rempHrs * dMart.empRatePerHr;
                }
            }
            int totalEmpWage = totalEmpHrs * dMart.empRatePerHr;
            int totalEmpWageR = totalEmpHrs * reliance.empRatePerHr;
            System.out.println("Total Emp Wage for " + dMart.company + " is :- " + totalEmpWage);
            System.out.println("Total Emp Wage for " + reliance.company + " is :- " + totalEmpWageR);

        }
    }
}