package pattern.factorymethod;

public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("������Ƥ���Ǻ�ɫ��");
    }

    @Override
    public void talk() {
        System.out.println("������˵����");

    }

}
