package com.intellekta.staff;

public class MonthlyStaff implements Staff {

    private int workDay;

    private int premium;

    public MonthlyStaff(int workDay, int premium) {
        this.workDay = (workDay <= 0 || workDay > 30) ? 0 : workDay;
        this.premium = (premium < 0 || premium > 10_000) ? 0 : premium;
    }

    public int getWorkDay() {
        return workDay;
    }

    public int getPremium() {
        return premium;
    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return 0;
        }
        return (salary * workDay) + premium;
    }

    public void printYearSalary(int salary) {
        if (salary < 0) {
            System.out.println(0);
        }
        System.out.println(calculateSalary(26));
    }
}
