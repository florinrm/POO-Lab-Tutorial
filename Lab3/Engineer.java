package lab3demo;

public class Engineer {
    private String name;
    private int experienceYears;
    private String surname;

    public Engineer(int experienceYears, String name, String surname) {
        this.name = name;
        this.experienceYears = experienceYears;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // o metoda care afiseaza detalii despre inginer
    public void showCV() {
        System.out.print(name + " " + surname + " has " + experienceYears + " years experience");
    }

    public void showSkills() {}
}
