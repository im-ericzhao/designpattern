package decorator;

/**
 * 装饰模式(Decorator)
 * 服饰类
 */
public class Finery extends Person {

    protected Person component;

    // 打扮
    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }

}

class TShirts extends Finery {

    public void show() {
        System.out.print("大T恤  ");
        super.show();
    }

}

class BigTrouser extends Finery {

    public void show() {
        System.out.print("大裤头  ");
        super.show();
    }

}

class Sneakers extends Finery {

    public void show() {
        System.out.print("破球鞋  ");
        super.show();
    }

}

class Suit extends Finery {

    public void show() {
        System.out.print("西装  ");
        super.show();
    }

}

class Tie extends Finery {

    public void show() {
        System.out.print("领带  ");
        super.show();
    }

}

class LeatherShoes extends Finery {

    public void show() {
        System.out.print("皮鞋  ");
        super.show();
    }

}