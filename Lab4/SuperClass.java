package lab4_other;

public class SuperClass {
    static {
        System.out.println("static super class");
    }

    {
        System.out.println("super class");
    }

    public final void doStuff() {
        System.out.println("something");
    }
}
