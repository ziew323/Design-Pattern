package pattern.compare.behavior.life.state;

public class Client {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new ChildState());
        human.work();
        human.work();
        human.work();
    }
}
