package polyExercise;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    SalariedEmployee(String FirstName,String LastName,int SSN,double weeklySalary){
        super(FirstName,LastName,SSN);
        this.weeklySalary = weeklySalary;
    }

    public double earning(){
        return weeklySalary;
    }

    public String toString(){
        return "Hourly Employee: " + super.FirstName + " " + super.LastName + "%nSocial Security Number: " + super.SSN + "%nWeekly Salary: " + weeklySalary;
    }
}
