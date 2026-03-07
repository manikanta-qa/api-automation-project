package Pojo;

public class EmpAddressPojo {
    private int zip;
    private String state;
    private String city;
    private HouseDetailsPojo housedetails;

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity(){
        return city;
    }
    public void setState(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }
    public int getZip(){
        return zip;
    }
    public void setZip(int zip){
        this.zip=zip;
    }

}
