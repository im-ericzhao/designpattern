package builder;

/**
 * 建造者模式(Builder)
 * 建造者抽象类
 */
public abstract class PersonBuilder {

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();

}