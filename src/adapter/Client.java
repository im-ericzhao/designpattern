package adapter;

/**
 * 适配器模式(Adapter)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        Player k = new Guards("科比");
        k.attack();
        Player m = new Forwards("麦迪");
        m.attack();
//        Player y = new Center("姚明");
        Player y = new Translator("姚明");
        y.attack();
        y.defense();
    }

}
