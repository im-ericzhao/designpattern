package proxy;

/**
 * 代理模式(Proxy)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("小龙女");

        Proxy proxy = new Proxy(mm);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();

    }

}
