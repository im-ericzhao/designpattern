package command;

/**
 * 命令模式(Command)
 * 具体烤羊肉命令
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(BarbecueMan receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }

    @Override
    public String toString() {
        return "烤羊肉";
    }

}
