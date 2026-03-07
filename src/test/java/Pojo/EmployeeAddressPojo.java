package Pojo;

public class EmployeeAddressPojo {
    private String city;
    private String state;
    private double zip;
    private HouseDetailsPojo housedetails;


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getZip() {
        return zip;
    }

    public void setZip(double zip) {
        this.zip = zip;
    }

    public HouseDetailsPojo getHousedetails() {
        return housedetails;
    }

    public void setHousedetails(HouseDetailsPojo housedetails) {
        this.housedetails = housedetails;
    }


}

