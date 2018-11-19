package visitor;

/**
 * 访问者模式(Visitor)
 * 具体"状态"类：失败
 */
public class Failing extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + this.getClass().getSimpleName()
                + "时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + this.getClass().getSimpleName()
                + "时，眼泪汪汪，谁也劝不了。");
    }

}
