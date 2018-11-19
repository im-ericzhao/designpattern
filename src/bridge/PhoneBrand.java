package bridge;

/**
 * 桥接模式(Bridge)
 * 手机品牌抽象类
 */
public abstract class PhoneBrand {

    protected PhoneSoft soft;

    // 设置手机软件
    public void setPhoneSoft(PhoneSoft soft) {
        this.soft = soft;
    }

    public abstract void run();

}
