package pattern.factory;

public class WhiteHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("������Ƥ���ǰ׵�");
    }

    @Override
    public void talk() {
        System.out.println("������˵����");
    }

}
