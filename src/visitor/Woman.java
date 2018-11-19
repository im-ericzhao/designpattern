package visitor;

/**
 * 访问者模式(Visitor)
 * "女人"类
 */
public class Woman extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }

}
