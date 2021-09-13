package week1_weekly_salary_calculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateWeeklySalary {

    public static void main(String[] args) {

        int baseSalary, weeklyWorkingHours, weekendWorkingHours;
        double hourlyWage;
        int workingWeekendBonus = 500;
        double weeklySalary;
        double wageIncreaseRate = 2;
        HourlyWageCalculations hourlyWageCalculations = new HourlyWageCalculations();
        System.out.println("*********** Calculate weekly salary ***********");
        Scanner integerNumber = new Scanner(System.in);

        
        try{

            System.out.print("Please enter employee's based salary : ");
            baseSalary = integerNumber.nextInt();
            System.out.print("Please enter how many hours the employee works on a weekday: ");
            weeklyWorkingHours = integerNumber.nextInt();
            System.out.print("Please enter how many hours the employee works on a weekend:  ");
            weekendWorkingHours = integerNumber.nextInt();
            integerNumber.close();

            //Base salary must be at least 1000 euros.
            if( baseSalary >= 1000){

                //The weekly working hour standard is 40 hours per week.
                if(weeklyWorkingHours >= 40){
                    weeklySalary = baseSalary + ((weeklyWorkingHours - 40) * (hourlyWageCalculations.weekdaysHourlyWage(baseSalary) * 1.5));
                    if(weekendWorkingHours > 0){
                        weeklySalary = hourlyWageCalculations.weekendHourlyWage(weekendWorkingHours, weeklySalary, workingWeekendBonus, wageIncreaseRate);
                    }

                //If the employee works less than 40 hours on weekdays, the hours not worked should be deducted from her weekly salary.
                }else if (weeklyWorkingHours < 40){

                    weeklySalary = (40 - weeklyWorkingHours) * hourlyWageCalculations.weekdaysHourlyWage(baseSalary);
                    if(weekendWorkingHours > 0){
                        weeklySalary =  weeklySalary + (weekendWorkingHours * wageIncreaseRate);
                    }

                }else{

                    //(weeklyWorkingHours == 40)
                    weeklySalary = hourlyWageCalculations.weekendHourlyWage(weekendWorkingHours, baseSalary, workingWeekendBonus, wageIncreaseRate);

                }

                //At the end of the program, we need to print the employee's salary to the console as output.
                System.out.println("Employee's weekly salary = " + weeklySalary);
            }else{
                System.out.println("Salary cannot be less than 1000 euros.");
            }

        }catch (InputMismatchException e){
            System.out.println("Sorry, you made a wrong or incomplete transaction.");
            System.exit(0);
        }
    }
}
