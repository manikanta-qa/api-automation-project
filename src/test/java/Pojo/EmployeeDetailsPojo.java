package Pojo;

import java.util.List;

public class EmployeeDetailsPojo {
    private String name;
    private int age;
    private double salary;
    private EmployeeAddressPojo empAddress;

    private Boolean marries;
    private int id;
    private String createdAt;
    private List<String> banks;

    public String getName(){
        return name;
    }
    public void setName(String name){
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
    public void setSalary( double salary){
        this.salary=salary;
    }
    public Boolean getMarries(){
        return marries;
    }
    public void setMarries(Boolean marries){
        this.marries=marries;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public void  setCreatedAt(String createdAt){
        this.createdAt=createdAt;
    }
    public EmployeeAddressPojo getEmpAddress(){
        return empAddress;
    }
    public void setEmpAddress(EmployeeAddressPojo empAddress ){
        this.empAddress=empAddress;
    }

    public List<String> getBanks(){
        return banks;
    }
    public void setBanks(List<String>banks){
        this.banks=banks;

    }
}
