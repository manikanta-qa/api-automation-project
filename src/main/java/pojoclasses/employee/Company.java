package pojoclasses.employee;

import java.util.List;

public class Company {
private String companyName;
private String companyHOCity;
private List<String> supportedSalaryBanks;
private List<Employee> employees;
private PfDetails companyPFDetails;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyHOCity() {
        return companyHOCity;
    }

    public void setCompanyHOCity(String companyHOCity) {
        this.companyHOCity = companyHOCity;
    }

    public List<String> getSupportedSalaryBanks() {
        return supportedSalaryBanks;
    }

    public void setSupportedSalaryBanks(List<String> supportedSalaryBanks) {
        this.supportedSalaryBanks = supportedSalaryBanks;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public PfDetails getCompanyPFDetails() {
        return companyPFDetails;
    }

    public void setCompanyPFDetails(PfDetails companyPFDetails) {
        this.companyPFDetails = companyPFDetails;
    }



}
