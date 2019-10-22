package lab4_other;

public class Main {
    public static void main(String[] args) {
        String username = "malone";
        String password = new PasswordGenerator().generate(username);
        //String password = PasswordGenerator.getInstance().generate(username);
        System.out.println(password);

        System.out.println("SuperClass");
        new SuperClass();
        System.out.println("SubClass");
        new SubClass();
    }
}
