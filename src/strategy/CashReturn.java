package strategy;

/**
 * 策略模式(Strategy)
 * 返利收费子类
 */
public class CashReturn extends CashSuper {

    // 满多少
    private double moneyCondition = 1.0;
    // 返多少
    private double moneyReturn = 1.0;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }

}
