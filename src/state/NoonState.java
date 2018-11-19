package state;

/**
 * 状态模式(State)
 * 中午工作状态
 */
public class NoonState extends State {

    @Override
    public void coding(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间：" + work.getHour() + "点 饿了，午饭；犯困，午休！");
        } else {
            work.setState(new AfternoonState());
            work.coding();
        }
    }

}
