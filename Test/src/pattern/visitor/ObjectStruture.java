package pattern.visitor;

import java.util.Random;

/**
 * Created by DARE2DREAM on 2016/11/20 0020.
 */
public class ObjectStruture {
    public static Element createElement(){
        Random rand = new Random();
        if(rand.nextInt(100)>50){
            return new ConcreteElement1();
        }else{
            return new ConcreteElement2();
        }
    }
}
