package strategy;

/**
 * 策略模式(Strategy)
 * 打折收费子类
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1.0;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }

}
