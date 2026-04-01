package pkg2;

public class Course {
   private String courseName;
   private String courseID;
   private double price;
   
     
   public Course(String courseName, String courseID, double price) {
	super();
	this.courseName = courseName;
	this.courseID = courseID;
	this.price = price;
}
   public String getCourseName() {
	return courseName;
}
   public void setCourseName(String courseName) {
	this.courseName = courseName;
   }
   public String getCourseID() {
	return courseID;
   }
   public void setCourseID(String courseID) {
	this.courseID = courseID;
   }
   public double getPrice() {
	return price;
   }
   public void setPrice(double price) {
	this.price = price;
   }
}
