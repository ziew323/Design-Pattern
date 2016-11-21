package pattern.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);
        ConcreteColleague3 concreteColleague3 = new ConcreteColleague3(mediator);
        mediator.setC1(concreteColleague1);
        mediator.setC2(concreteColleague2);
        mediator.setC3(concreteColleague3);

        concreteColleague1.depMethod1();
        concreteColleague2.depMethod1();
        concreteColleague3.depMethod1();
    }
}
