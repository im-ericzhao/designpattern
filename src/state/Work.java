package state;

/**
 * 状态模式(State)
 * 工作类
 */
public class Work {

    private int hour;

    private State current;

    private boolean finish = false;

    public Work() {
        current = new ForenoonState();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public State getState() {
        return current;
    }

    public void setState(State current) {
        this.current = current;
    }

    public void coding() {
        current.coding(this);
    }

}
