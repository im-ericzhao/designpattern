package facade;

/**
 * 外观模式(Facade)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        Fund fund = new Fund();
        // 基金买入
        fund.buyFund();
        // 基金赎回
        fund.sellFund();
    }

}
