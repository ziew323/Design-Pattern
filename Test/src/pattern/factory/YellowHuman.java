package pattern.factory;

public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("������Ƥ���ǻ�ɫ��");
    }

    @Override
    public void talk() {
        System.out.println("������˵����");
    }

}
