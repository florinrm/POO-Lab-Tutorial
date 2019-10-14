package lab3demo;

import java.util.ArrayList;

public class DemoLab3 {
    public static void main(String[] args) {
        // agregare si compunere - HAS A
        Singer singer1 = new Singer("Parazitii", "Hip-hop");
        Song song1 = new Song("Antimilitie", "Lovitura de pedeapsa", 2019, singer1);
        Song song2 = new Song("Toate-s la fel",  2012, singer1);
        System.out.println(song1);
        System.out.println(song2);

        // mostenire - IS A
        SoftwareEngineer sw1 = new SoftwareEngineer(10, "Roby", "Roberto");
        sw1.addSkill("Java");
        sw1.addSkill("C#");
        sw1.addSkill("C++");
        sw1.addSkill("Python");
        sw1.displaySkills();

        MechanicalEngineer mc1 = new MechanicalEngineer(30, "Lucian", "Mihalache", "naval");
        ArrayList<Engineer> engineers = new ArrayList<>();
        // upcasting - ea se face automat
        engineers.add(sw1);
        engineers.add(mc1);

        // downcasting - cu instanceof
        for (Engineer eng : engineers) {
            if (eng instanceof SoftwareEngineer)
                ((SoftwareEngineer)eng).displaySkills();
            else if (eng instanceof MechanicalEngineer)
                ((MechanicalEngineer)eng).showEngineType();
        }

        // downcasting - fara instanceof - de recomandat
        for (Engineer eng : engineers) {
            eng.showSkills();
        }
    }
}
