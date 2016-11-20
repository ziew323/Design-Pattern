package pattern.memento.demo;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Originator {
    private String state = "";

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
