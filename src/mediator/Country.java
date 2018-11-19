package mediator;

/**
 * 中介者模式(Mediator)
 * 国家
 */
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

}
