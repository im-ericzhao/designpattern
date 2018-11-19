package iterator;

/**
 * 迭代器模式(Iterator)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.set(0, "大鸟");
        aggregate.set(1, "小菜");
        aggregate.set(2, "行李");
        aggregate.set(3, "老外");
        aggregate.set(4, "公交内部员工");
        aggregate.set(5, "小偷");

        Iterator iterator = new ConcreteIterator(aggregate);
        Object item = iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem() + " 请买车票！");
            iterator.next();
        }
    }

}
