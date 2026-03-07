package Pojo;

import java.util.List;

public class HouseDetailsPojo {
    private int flatNo;
    private String street;
    private String appartmentName;
    private List<String> landmark;


    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {

        this.flatNo = flatNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {

        this.street = street;
    }
    public String getAppartmentName(){
        return appartmentName;
    }
    public void setAppartmentName(String appartmentName ){
        this.appartmentName=appartmentName;
    }

    public List<String> getLandmark() {

        return landmark;
    }


    public void setLandmark(List<String> landmark) {

        this.landmark = landmark;
    }
}
