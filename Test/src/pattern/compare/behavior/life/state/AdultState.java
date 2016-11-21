package pattern.compare.behavior.life.state;

public class AdultState extends HumanState {

    @Override
    public void work() {
        System.out.println("The adults' job is to work");
        super.human.setState(Human.OLD_STATE);
    }

}
