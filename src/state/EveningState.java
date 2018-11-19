package state;

/**
 * 状态模式(State)
 * 晚间工作状态
 */
public class EveningState extends State {

    @Override
    public void coding(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.coding();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + "点 加班哦，疲累之极！");
            } else {
                work.setState(new SleepingState());
                work.coding();
            }
        }
    }

}
