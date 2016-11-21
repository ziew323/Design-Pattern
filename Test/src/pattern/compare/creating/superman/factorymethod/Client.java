package pattern.compare.creating.superman.factorymethod;

/**
 * @author jiaziwei
 *
 */
public class Client {
    public static void main(String[] args) {
        ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
        adultSuperMan.specialTalent();
        ISuperMan childSuperMan = SuperManFactory.createSuperMan("child");
        childSuperMan.specialTalent();
    }
}
