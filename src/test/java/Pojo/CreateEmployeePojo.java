package Pojo;

public class CreateEmployeePojo {
    private String name;
    private int  age;
    private double salary;
    private Boolean IsMarried;
    private EmployeeAddressPojo address;


    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public EmployeeAddressPojo getAddress(){
        return address;
    }
    public void setAddress(EmployeeAddressPojo address){
        this.address=address;
    }
}
