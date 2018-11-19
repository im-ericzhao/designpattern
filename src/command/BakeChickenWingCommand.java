package command;

/**
 * 命令模式(Command)
 * 具体烤鸡翅命令
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(BarbecueMan receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeChickenWing();
    }

    @Override
    public String toString() {
        return "烤鸡翅";
    }
}
