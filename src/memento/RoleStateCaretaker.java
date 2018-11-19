package memento;

/**
 * 备忘录模式(Memento)
 * 游戏角色状态管理者
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }

}
