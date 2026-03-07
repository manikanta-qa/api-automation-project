package pojoclasses.courses;

public class Api {
    private String courseTitle;

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private String price;

    public String getPrice() {
        return price;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

}


