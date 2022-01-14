package polyExercise;

public class BasePlusCommisionEmployee extends CommisionEmployee {

    private double baseSalary;

    BasePlusCommisionEmployee(String FirstName, String LastName, int SSN, double commissionRate, double grossSales,double baseSalary) {
        super(FirstName, LastName, SSN, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }

    public double earning(){
        return (super.commissionRate * super.grossSales) + baseSalary;
    }
}
