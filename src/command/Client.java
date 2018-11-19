package command;

/**
 * 命令模式(Command)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        // 开店前的准备
        BarbecueMan man = new BarbecueMan();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(man);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(man);
        Command bakeChickenWingCommand = new BakeChickenWingCommand(man);
        Waiter waiter = new Waiter();
        // 开门营业
        waiter.setOrder(bakeMuttonCommand1);
        waiter.setOrder(bakeMuttonCommand2);
        waiter.setOrder(bakeChickenWingCommand);
        // 点菜完毕，通知厨房
        waiter.notice();
    }

}
