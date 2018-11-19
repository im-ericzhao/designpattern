package command;

/**
 * 命令模式(Command)
 * 抽象命令类
 */
public abstract class Command {

    protected BarbecueMan receiver;

    public Command(BarbecueMan receiver) {
        this.receiver = receiver;
    }

    // 执行命令
    public abstract void excuteCommand();

}
