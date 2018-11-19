package state;

/**
 * 状态模式(State)
 * 睡眠状态
 */
public class SleepingState extends State {

    @Override
    public void coding(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 不行了，睡着了！");
    }

}
