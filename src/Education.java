import java.util.ArrayList;

class Education {
 String degree;
 String school;
 int date;


 public ArrayList<String> getDegree() {
  return edu;
 }

 public void setDegree(String degree) {
  this.edu.add(degree);
 }

 public String getSchool() {
  return school;
 }

 public void setSchool(String school) {
  this.school = school;
 }

 public int getDate() {
  return date;
 }

 public void setDate(int date) {
  this.date = date;
 }
 ArrayList<String> edu = new ArrayList<String>();

}
