package com.intellekta.staff;

public class WeeklyStaff extends MonthlyStaff implements Staff {

    private int workWeek;

    public WeeklyStaff(int workDay, int premium, int workWeek) {
        super(workDay, premium);
        this.workWeek = (workWeek <= 2 || workDay >= 4) ? 0 : workWeek;
    }

    public int getWorkWeek() {
        return workWeek;
    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return 0;
        }
        return workWeek * salary;
    }
}
