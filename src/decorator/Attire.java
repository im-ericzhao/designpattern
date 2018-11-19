package decorator;

/**
 * 装饰模式(Decorator)
 * 客户端main方法
 */
public class Attire {

    public static void main(String[] args) {
        Person p0 = new Person("Kobe");
        System.out.println("第一种装扮：");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();
        tShirts.decorate(p0);
        bigTrouser.decorate(tShirts);
        sneakers.decorate(bigTrouser);
        sneakers.show();

        Person p1 = new Person("Allen");
        System.out.println("第二种装扮：");
        Suit suit = new Suit();
        Tie tie = new Tie();
        LeatherShoes leatherShoes = new LeatherShoes();
        leatherShoes.decorate(p1);
        tie.decorate(leatherShoes);
        suit.decorate(tie);
        suit.show();

    }

}
