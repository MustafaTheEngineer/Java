package Week4;

public class Worker {
    private String name;
    private int salary;
    private static int counter=0;

    Worker(String name,int salary){
        setName(name);
        setSalary(salary);
        ++counter;
    }

    void setName(String newName){
        this.name = newName;
    }

    void setSalary(int newSalary){
        if(newSalary <= 0)
            throw new IllegalArgumentException("Salary must be higher than 0");
        else
            this.salary = newSalary;
    }

    void showInfo(){
        System.out.println(this.name + " - " + this.salary);
    }

    int getCounter(){
        return counter;
    }
}
