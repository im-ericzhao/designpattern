package iterator;

/**
 * 迭代器模式(Iterator)
 * 抽象类
 */
public abstract class Iterator {

    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();

}
