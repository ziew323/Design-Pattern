package pattern.templatemethod;

public abstract class Game {
    public void initialize() {
        System.out.println("Game Initialized! Start playing.");
    }

    /**
     * ���ӷ���
     */
    abstract void startPlay();

    public void endPlay() {
        System.out.println("Game Finished!");
    }

    //ģ��
    public final void play() {

        //��ʼ����Ϸ
        initialize();

        //��ʼ��Ϸ
        startPlay();

        //������Ϸ
        endPlay();
    }
}