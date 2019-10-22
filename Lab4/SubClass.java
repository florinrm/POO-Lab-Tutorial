package lab4_other;

public class SubClass extends SuperClass {
    static {
        System.out.println("static subclass");
    }

    {
        System.out.println("subclass");
    }

    /*
    public void doStuff() {

    }*/
}
