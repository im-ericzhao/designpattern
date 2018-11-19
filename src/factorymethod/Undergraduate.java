package factorymethod;

/**
 * 工厂方法模式(Factory Method)
 * 大学生类
 */
public class Undergraduate extends LeiFeng {

    @Override
    public void sweep() {
        System.out.println("学雷锋的大学生帮忙扫地");
    }

    @Override
    public void wash() {
        System.out.println("学雷锋的大学生帮忙洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("学雷锋的大学生帮忙买米");
    }

}
