import java.util.ArrayList;

class Experience {
    String jobTital;
    String location;
    String date;


    public ArrayList<String> getExperience() {
        return exp;
    }

    public void setExperience(String strExp) {
        this.exp.add(strExp);
    }

    /*public String getJobTital() {
        return jobTital;
    }

    public void setJobTital(String jobTital) {
        this.jobTital = jobTital;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
*/
    ArrayList<String> exp = new ArrayList<String>();{
    }
}