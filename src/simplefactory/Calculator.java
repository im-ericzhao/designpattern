package simplefactory;

/**
 * 简单工厂方法(Simple Factory)
 * 客户端main方法
 */
public class Calculator {

    public static void main(String[] args) {
        Operation operation;
        operation = OperationFactory.createOperate("+");
        operation.numberA = 20;
        operation.numberB = 10;
        double result = operation.getResult();
        System.out.println(result);
    }

}

