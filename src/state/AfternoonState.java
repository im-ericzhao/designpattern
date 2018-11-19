package state;

/**
 * 状态模式(State)
 * 下午工作状态
 */
public class AfternoonState extends State {

    @Override
    public void coding(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.coding();
        } else {
            if (work.getHour() < 17) {
                System.out.println("当前时间：" + work.getHour() + "点 下午状态还不错，继续努力！");
            } else {
                work.setState(new EveningState());
                work.coding();
            }
        }
    }

}
