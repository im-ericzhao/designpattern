package visitor;

/**
 * 访问者模式(Visitor)
 * "男人"类
 */
public class Man extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

}
