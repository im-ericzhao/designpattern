package factorymethod;

/**
 * 工厂方法模式(Factory Method)
 * 社区志愿者类
 */
public class Volunteer extends LeiFeng {

    @Override
    public void sweep() {
        System.out.println("社区志愿者帮忙扫地");
    }

    @Override
    public void wash() {
        System.out.println("社区志愿者帮忙洗衣");
    }

    @Override
    public void buyRice() {
        System.out.println("社区志愿者帮忙买米");
    }

}
