import java.util.Scanner;

public class Main {

  static  String name, email, education, experience, skill, nextEdu, nextExp, nextSk,school;

    public static void main(String[] args) {
        // write your code here

        int cntEdu = 1, cntExp = 1, cntSkill = 1;
        int year;
        Scanner input = new Scanner(System.in);

        //input name
        System.out.println("What is your Name: ");
        name = input.nextLine();

        //input email
        System.out.println("What is your E-mail: ");
        email = input.nextLine();

        //instantiate Education Class
        Education eduClass = new Education();
        //inputEducation

        do {
            System.out.println("What is your Education: ");
            education = input.nextLine();
           System.out.println("School name: ");
          school = input.nextLine();
            eduClass.setDegree("Education " + cntEdu + " :" + education + " " + school);
            System.out.println("Do you want to add more Education? Y/N? ");
            nextEdu = input.nextLine();
            cntEdu++;
            if (cntEdu == 10) break;
        } while (!nextEdu.equalsIgnoreCase("N"));

        //Get Array List Degree From Education class
        String strEducationList = "";
        int e = 0;
        while (eduClass.getDegree().size() > e) {
            strEducationList += eduClass.getDegree().get(e) + "\n";
            e++;
        }
        //instantiate Experience Class
        Experience expClass = new Experience();
        //input Experience

        do {
            System.out.println("What is your Experience: ");
            experience = input.nextLine();
            expClass.setExperience("Experience" + cntExp + " :" + experience);
            System.out.println("Do you want to add more Experience? Y/N ");
            nextExp = input.nextLine();
            cntExp++;
            if (cntExp == 10) break;
        } while (!nextExp.equalsIgnoreCase("N"));

        //get array list expereince from expereince class
        String strExperienceList = "";
        int exp = 0;
        while (expClass.getExperience().size() > exp) {
            strExperienceList += expClass.getExperience().get(exp) + "\n";
            exp++;
        }

        //instantiate Skill Class
        Skill skClass = new Skill();
        //input Skill
        do {
            System.out.println("What is your Skills: ");
            skill = input.nextLine();
            skClass.setSkills("Skills" + cntSkill + " :" + skill);
            System.out.println("Do you want to add more Skill? Y/N ");
            nextSk = input.nextLine();
            cntSkill++;
            if (cntSkill == 20) break;
        } while (!nextSk.equalsIgnoreCase("N"));

        String strSkill = "";
        int sk = 0;
        while (skClass.getSkill().size() > sk) {
            strSkill += skClass.getSkill().get(sk) + "\n";
            sk++;
        }


        // System.out.println(name + "\n" + email + "\n" + education + "\n" + experience + "\n" + skill);
        //   System.out.println(name +"\n" + email+ "\n" + strEducationList + "\n" + strExperienceList );

        System.out.println("Name: "+ name +"\n Email: "+ email+ "\n" +"School: " + school +"\n" + strEducationList + "\n" + strExperienceList +"\n" +strSkill );

    }
}