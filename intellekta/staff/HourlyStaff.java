package com.intellekta.staff;

public class HourlyStaff implements Staff {
    private int workTime;

    public HourlyStaff(int workTime) {
        this.workTime = (workTime <= 4 || workTime >= 10) ? 0 : workTime;
    }

    @Override
    public int calculateSalary(int salary) {
        if (salary < 0) {
            return 0;
        }
        return workTime * salary;
    }

    public int getWorkTime() {
        return workTime;
    }
}
