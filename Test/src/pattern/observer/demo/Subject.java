package pattern.observer.demo;

import java.util.Vector;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public abstract class Subject {
    private Vector<Observer> observers = new Vector<Observer>();

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void delObserver(Observer o){
        this.observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o:observers){
            o.update();
        }
    }
}
