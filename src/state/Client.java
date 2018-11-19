package state;

/**
 * 状态模式(State)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.coding();
        work.setHour(10);
        work.coding();
        work.setHour(12);
        work.coding();
        work.setHour(13);
        work.coding();
        work.setHour(14);
        work.coding();
        work.setHour(17);
        work.coding();
//        work.setFinish(true);
        work.setHour(19);
        work.coding();
        work.setHour(22);
        work.coding();
    }

}
