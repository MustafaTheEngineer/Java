package polyExercise;

public class CommisionEmployee extends Employee {
    protected double commissionRate;
    protected double grossSales;

    CommisionEmployee(String FirstName, String LastName, int SSN,double commissionRate,double grossSales) {
        super(FirstName, LastName, SSN);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double earning(){
        return commissionRate * grossSales;
    }

    public String toString(){
        return "Hourly Employee: " + super.FirstName + " " + super.LastName + "%nSocial Security Number: " + super.SSN + "%Gross Sales: " + grossSales + "%nCommissionRate: " + commissionRate;
    }
    
}
