package pattern.composite;

import java.util.ArrayList;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Composite extends Component {
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    public void add(Component component){
        this.componentArrayList.add(component);
    }

    public void remove(Component component){
        this.componentArrayList.remove(component);
    }

    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}
