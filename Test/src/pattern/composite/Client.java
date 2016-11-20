package pattern.composite;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        root.add(branch);
        Leaf leaf = new Leaf();
        branch.add(leaf);
        Leaf leaf2 = new Leaf();
        branch.add(leaf);
        display(root);
    }

    public static void display(Composite root){
        for (Component c:root.getChildren()){
            if(c instanceof Leaf){
                c.doSomething();
            }else{
                display((Composite) c);
            }
        }
    }
}
