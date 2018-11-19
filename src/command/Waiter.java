package command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 命令模式(Command)
 * 服务员
 */
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    // 设置订单
    public void setOrder(Command command) {
        if (command.toString() == "烤鸡翅") {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        } else {
            orders.add(command);
            System.out.println("增加订单：" + command.toString() + " 时间：" + new Date().toString());
        }
    }

    // 取消订单
    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单：" + command.toString() + " 时间：" + new Date().toString());
    }

    // 通知全部执行
    public void notice() {
        for (Command cmd : orders) {
            cmd.excuteCommand();
        }
    }

}
