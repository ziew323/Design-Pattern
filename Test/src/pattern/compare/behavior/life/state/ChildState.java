package pattern.compare.behavior.life.state;

public class ChildState extends HumanState {

    @Override
    public void work() {
        System.out.println("The children's job is to play");
        super.human.setState(Human.ADULT_STATE);
    }

}
