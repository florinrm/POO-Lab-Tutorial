package lab3demo;

public class MechanicalEngineer extends Engineer {
    private String engineType;

    public MechanicalEngineer(String name, int experienceYears, String surname) {
        super(experienceYears, name, surname);
    }

    public MechanicalEngineer(int experienceYears, String name, String surname, String engineType) {
        super(experienceYears, name, surname);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void showEngineType() {
        System.out.println(super.getName() + " works on " + engineType + " engines");
    }

    @Override
    public void showSkills() {
        showEngineType();
    }

    @Override
    public void showCV() {
        super.showCV();
        System.out.println("He / she works on " + engineType + " engines");
    }
}
