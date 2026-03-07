package Runner;


import pojoclasses.employee.Company;
import pojoclasses.employee.Employee;
import pojoclasses.employee.PfDetails;
import org.testng.annotations.Test;


import java.util.ArrayList;
import java.util.List;

public class CreateEmployees {
@Test
    public static void  createEmployee(){
        Company company=new Company();
        company.setCompanyName("MR Soft Solution");
        company.setCompanyHOCity("Hyderabad");
        List<String> supportedSalaryBanks=new ArrayList<>();
        supportedSalaryBanks.add("HDFC");
        supportedSalaryBanks.add("ICICI");
        supportedSalaryBanks.add("SBI");
        company.setSupportedSalaryBanks(supportedSalaryBanks);
        Employee employee1=new Employee();
        employee1.setFirstName("Raghava");
        employee1.setLastName("reddy");
        employee1.setMarried("married");
        employee1.setAge(29);
        Employee employee2=new Employee();
        employee2.setFirstName("rajaram");
        employee2.setLastName("reddy");
        employee2.setMarried("married");
        employee2.setAge(29);
        List<Employee>employee=new ArrayList<>();
        employee.add(employee1);
        employee.add(employee2);
        //Set Employee list to comapnay
        company.setEmployees(employee);
        PfDetails pfDetails=new PfDetails();
        pfDetails.setPfCity("Hyderabad");
        pfDetails.setPfYear("2018");
        pfDetails.setPfName("Mani");
        company.setCompanyPFDetails(pfDetails);









    }
}
