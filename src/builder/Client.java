package builder;

/**
 * 建造者模式(Builder)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("【大瘦合体】");
        PersonThinBuilder ptb = new PersonThinBuilder();
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.createPerson();

        System.out.println("【小胖合体】");
        PersonFatBuilder pfb = new PersonFatBuilder();
        PersonDirector pdFat = new PersonDirector(pfb);
        pdFat.createPerson();
    }

}
