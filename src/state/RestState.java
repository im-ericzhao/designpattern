package state;

/**
 * 状态模式(State)
 * 下班休息状态
 */
public class RestState extends State {

    @Override
    public void coding(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 下班回家了！");
    }

}
