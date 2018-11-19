package memento;

/**
 * 备忘录模式(Memento)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        // 打Boss前
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.getInitState();
        lixiaoyao.stateDisplay();
        // 保存进度
        RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
        stateAdmin.setMemento(lixiaoyao.saveState());
        // 打Boss时，GameOver了
        lixiaoyao.fight();
        lixiaoyao.stateDisplay();
        // 恢复之前状态
        lixiaoyao.recoveryState(stateAdmin.getMemento());
        lixiaoyao.stateDisplay();
    }

}
