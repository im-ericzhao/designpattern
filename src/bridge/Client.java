package bridge;

/**
 * 桥接模式(Bridge)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        PhoneBrand phoneBrand;
        phoneBrand = new PhoneBrandN();
        phoneBrand.setPhoneSoft(new PhoneGame());
        phoneBrand.run();
        phoneBrand.setPhoneSoft(new PhoneAddressList());
        phoneBrand.run();

        phoneBrand = new PhoneBrandM();
        phoneBrand.setPhoneSoft(new PhoneGame());
        phoneBrand.run();
        phoneBrand.setPhoneSoft(new PhoneAddressList());
        phoneBrand.run();
    }

}
