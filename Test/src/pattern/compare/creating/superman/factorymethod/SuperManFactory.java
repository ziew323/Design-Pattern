package pattern.compare.creating.superman.factorymethod;

public class SuperManFactory {
    public static ISuperMan createSuperMan(String type) {
        if (type.equalsIgnoreCase("adult")) {
            return new AdultSuperMan();
        } else if (type.equalsIgnoreCase("child")) {
            return new ChildSuperMan();
        } else {
            return null;
        }
    }
}
