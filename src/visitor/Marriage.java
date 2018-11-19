package visitor;

/**
 * 访问者模式(Visitor)
 * 具体"状态"类：结婚
 */
public class Marriage extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + this.getClass().getSimpleName()
                + "时，感慨道：恋爱游戏终结时，'有妻徒刑'遥无期。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + this.getClass().getSimpleName()
                + "时，欣慰曰：爱情长跑路漫漫，婚姻保险保平安。");
    }

}
