package adapter;

/**
 * 适配器模式(Adapter)
 * 球员抽象类
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();

}
