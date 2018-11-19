package simplefactory;

/**
 * 简单工厂方法(Simple Factory)
 * 简单运算工厂类
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("不支持运算!");
        }
        return operation;
    }

}
