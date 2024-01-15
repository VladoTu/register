package register;

/**
 * Created by jaro on 3.2.2014.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Register register = new Register(20);

        register.addPerson(new Person("Janko Hrasko", "991"));
        register.addPerson(new Person("Jozo Hra", "090012345"));
        register.addPerson(new Person("Jana Hraskova", "0900976456"));

        ConsoleUI ui = new ConsoleUI(register);
        ui.run();
    }
}
