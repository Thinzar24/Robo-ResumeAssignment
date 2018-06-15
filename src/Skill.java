import java.util.ArrayList;

public class Skill {

    String skills;

    public ArrayList<String> getSkill() {
        return sk;
    }

    /* public String getSkills() {
         return skills;
     }
 */
    public void setSkills(String skills) {
        this.sk.add(skills);
    }
    ArrayList<String> sk = new ArrayList<String>();{


    }
}
