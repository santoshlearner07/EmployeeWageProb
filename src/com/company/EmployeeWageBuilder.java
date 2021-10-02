package com.company;

public class EmployeeWageBuilder {

    //constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int PER_DAY_WORK_HOUR = 8;


    public static void main(String[] args) {
//        variable
        int empPerDayIncome = 0;
        int empHrs = 0;

        int empCheck = (int) Math.floor(Math.random() * 10 % 3);
        switch (empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }

    }
}