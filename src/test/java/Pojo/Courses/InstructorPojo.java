package Pojo.Courses;

public class InstructorPojo {
    private String instructor;
    private String url;
    private String services;
    private String expertise;
    private CoursesPojo courses;
    private String linkedIn;

    public String getInstructor(){
        return instructor;
    }
    public void setInstructor(String instructor){
        this.instructor=instructor;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url=url;
    }
    public String getServices(){
        return services;
    }
    public void setService(String service){
        this.services=services;
    }
    public String getExpertise(){
        return expertise;
    }
    public void setServices(String expertise){
        this.expertise=expertise;
    }
    public CoursesPojo getCourses(){
        return courses;
    }
    public void setCourses(CoursesPojo courses){
        this.courses=courses;
    }
    public String getLinkedIn(){
        return linkedIn;
    }
    public void setLinkedIn(String linkedIn){
        this.linkedIn=linkedIn;
    }

}
