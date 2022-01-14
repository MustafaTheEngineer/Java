package CompanyProject;

import CompanyProject.App.CompanyName;

public class Company {
    private Employee employee;
    private CompanyName companyName;

    Company(Employee e,CompanyName c){
        this.employee = e;
        this.companyName = c;
    }

    Employee getEmployee(){
        return employee;
    }

    CompanyName getCompanyName(){
        return companyName;
    }
}
