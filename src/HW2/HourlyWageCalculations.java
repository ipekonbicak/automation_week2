package HW2;

public class HourlyWageCalculations {

    double weekdaysHourlyWage(int basedSalary){
        return basedSalary/40;
    }

    double weekendHourlyWage(int weekendWorkingHours, double weeklySalary, int workingWeekendBonus, double wageIncreaseRate){
        if(weekendWorkingHours > 0 && weekendWorkingHours <= 10){
            weeklySalary =  weeklySalary + (weekendWorkingHours * wageIncreaseRate);
        }else if (weekendWorkingHours >= 10 ){
            if(weekendWorkingHours == 10){
                weeklySalary =  weeklySalary + (weekendWorkingHours * wageIncreaseRate) + workingWeekendBonus;
            }else if(weekendWorkingHours >= 20){
                weeklySalary =  weeklySalary + (weekendWorkingHours * wageIncreaseRate) + (workingWeekendBonus*2);
            }
        }
        return weeklySalary;
    }
}
