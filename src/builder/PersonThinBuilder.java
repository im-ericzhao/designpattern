package builder;

/**
 * 建造者模式(Builder)
 * 大瘦建造类
 */
public class PersonThinBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("我来组成头部【大瘦】");
    }

    @Override
    public void buildBody() {
        System.out.println("我来组成身体【大瘦】");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("我来组成左臂【大瘦】");
    }

    @Override
    public void buildArmRight() {
        System.out.println("我来组成右臂【大瘦】");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("我来组成左腿【大瘦】");
    }

    @Override
    public void buildLegRight() {
        System.out.println("我来组成右腿【大瘦】");
    }

}
