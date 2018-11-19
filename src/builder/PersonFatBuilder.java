package builder;

/**
 * 建造者模式(Builder)
 * 小胖建造类
 */
public class PersonFatBuilder extends PersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("我来组成头部【小胖】");
    }

    @Override
    public void buildBody() {
        System.out.println("我来组成身体【小胖】");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("我来组成左臂【小胖】");
    }

    @Override
    public void buildArmRight() {
        System.out.println("我来组成右臂【小胖】");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("我来组成左腿【小胖】");
    }

    @Override
    public void buildLegRight() {
        System.out.println("我来组成右腿【小胖】");
    }

}
