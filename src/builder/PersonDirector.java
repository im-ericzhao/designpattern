package builder;

/**
 * 建造者模式(Builder)
 * 指挥者
 */
public class PersonDirector {

    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public void createPerson() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }

}
