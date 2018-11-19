package simplefactory;

/**
 * 简单工厂方法(Simple Factory)
 * Operation运算类
 */
public abstract class Operation {

    public double numberA = 0;
    public double numberB = 0;

    public abstract double getResult();

}

/**
 * 加法类
 */
class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return numberA + numberB;
    }

}

/**
 * 减法类
 */
class OperationSub extends Operation {

    @Override
    public double getResult() {
        return numberA - numberB;
    }

}

/**
 * 乘法类
 */
class OperationMul extends Operation {

    @Override
    public double getResult() {
        return numberA * numberB;
    }

}

/**
 * 除法类
 */
class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (numberB == 0) {
            throw new RuntimeException("除数不能为0!");
        }
        return numberA / numberB;
    }

}
