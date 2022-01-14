package polyExercise;

public abstract class Employee {

    protected String FirstName,LastName;
    protected int SSN;

    Employee(String FirstName,String LastName, int SSN){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SSN = SSN;
    }

    public abstract double earning();
    
    public String toString(){
        return FirstName + " " + LastName + "%nSocial Security Number: " + SSN;
    }
}
