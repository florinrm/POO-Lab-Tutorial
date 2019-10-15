package lab3demo;

import java.util.ArrayList;

public class SoftwareEngineer extends Engineer {
    private ArrayList<String> programmingLanguages;

    public SoftwareEngineer(int experienceYears, String name, String surname) {
        super(experienceYears, name, surname);
        programmingLanguages = new ArrayList<>();
    }

    public SoftwareEngineer(int experienceYears, String name, String surname, ArrayList<String> programmingLanguages) {
        super(experienceYears, name, surname);
        this.programmingLanguages = programmingLanguages;
    }

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void addSkill (String language) {
        this.programmingLanguages.add(language);
    }

    public void displaySkills() {
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
    }

    @Override
    public void showSkills() {
        displaySkills();
    }

    @Override
    public void showCV() {
        super.showCV();
        System.out.println("He / she works as software engineer and is skilled in " + programmingLanguages);
    }

    // overload
    public void showCV(String domain) {
        super.showCV();
        System.out.println("He / she works as " + domain + " software engineer and is skilled in " + programmingLanguages);
    }
}
