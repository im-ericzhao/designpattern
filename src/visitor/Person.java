package visitor;

/**
 * 访问者模式(Visitor)
 * "人"的抽象类
 */
public abstract class Person {

    // 接受
    public abstract void accept(Action visitor);

}
