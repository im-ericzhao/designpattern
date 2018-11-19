package visitor;

/**
 * 访问者模式(Visitor)
 * 具体"状态"类：恋爱
 */
public class Amativeness extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + this.getClass().getSimpleName()
                + "时，凡事不懂也要装懂。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + this.getClass().getSimpleName()
                + "时，遇事懂也装作不懂。");
    }

}
