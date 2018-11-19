package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 迭代器模式(Iterator)
 * 具体聚集类
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void set(int index, Object object) {
        items.add(index, object);
    }

}
