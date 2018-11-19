package state;

/**
 * 状态模式(State)
 * 上午工作状态
 */
public class ForenoonState extends State {

    @Override
    public void coding(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点 上午工作，精神百倍！");
        } else {
            work.setState(new NoonState());
            work.coding();
        }
    }

}
