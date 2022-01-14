package CompanyProject;

public class App {
    public enum CompanyName{
        APPLE,
        MICROSOFT,
        GOOGLE,
        IBM,
        AKINSOFT
    };
    public static void main(String[] args){
        Employee emp1 = new Employee(123,"Mustafa");
        Company comp = new Company(emp1,CompanyName.AKINSOFT);
    }
}
