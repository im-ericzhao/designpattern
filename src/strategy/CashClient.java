package strategy;

/**
 * 策略模式(Strategy)
 * 客户端main方法
 */
public class CashClient {

    public static void main(String[] args) {
        CashContext context = new CashContext("正常收费");
        double money0 = context.getResult(300);
        System.out.println("正常收费: " + money0);

        context = new CashContext("打8折");
        double money1 = context.getResult(300);
        System.out.println("打8折: " + money1);

        context = new CashContext("满300返100");
        double money2 = context.getResult(300);
        System.out.println("满300返100: " + money2);
    }

}
