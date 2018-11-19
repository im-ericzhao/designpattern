package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式(Visitor)
 * 对象结构
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<>();

    // 增加
    public void attach(Person element) {
        elements.add(element);
    }

    // 移除
    public void detach(Person element) {
        elements.remove(element);
    }

    // 查看显示
    public void display(Action visitor) {
        for (Person e : elements) {
            e.accept(visitor);
        }
    }

}
