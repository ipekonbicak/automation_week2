package HW2;

public class AnnualSalaryIncrease {
    public double salary;
    public int operationTime;

    public AnnualSalaryIncrease (double salary, int operationTime){
        int division = operationTime / 12;
        switch (division){
            case 0:
                System.out.println("The employee will not be given a raise because he/she has worked in " +
                        "the institution for less than 1 year. \n Salary: " +salary);
                break;
            case 1:
                salary = salary + (salary * (0.05));
                System.out.println("Increased salary of the employee:" +salary);
                break;
            case 2:
                salary = salary + (salary * (0.10));
                System.out.println("Increased salary of the employee:" +salary);
                break;
            case 3:
                salary = salary + (salary * (0.15));
                System.out.println("Increased salary of the employee:" +salary);
                break;
            case 4:
                salary = salary + (salary * (0.20));
                System.out.println("Increased salary of the employee:" +salary);
                break;
            default:
                salary = salary + (salary * (0.25));
                System.out.println("Increased salary of the employee:" +salary);
                break;
        }
    }
}
