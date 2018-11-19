package chainofresponsibility;

/**
 * 责任链模式(Chain of Responsibility)
 * 抽象管理者
 */
public abstract class Manager {

    protected String name;
    // 管理者的上级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    // 设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    // 申请请求
    public abstract void requestApplications(Request request);

}
