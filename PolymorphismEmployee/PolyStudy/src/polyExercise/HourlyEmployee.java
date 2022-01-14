package polyExercise;

public class HourlyEmployee extends Employee {
    public double wage;
    public int hours;

    HourlyEmployee(String FirstName, String LastName, int SSN,double wage, int hours) {
        super(FirstName, LastName, SSN);
        this.wage = wage;
        this.hours = hours;
    }

    public double earning(){
        if(hours <= 40)
            return wage*((double)hours);
        else
            return wage + ((double) hours - 40) * wage * 1.5;
    }

    public String toString(){
        return "Hourly Employee: " + super.FirstName + " " + super.LastName + "%nSocial Security Number: " + super.SSN + "%Gross Sales: "  + "%nCommissionRate: ";
    }
    
}
