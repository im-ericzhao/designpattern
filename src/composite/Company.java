package composite;

/**
 * 组合模式(Composite)
 * 公司抽象类
 */
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);// 增加
    public abstract void remove(Company company);// 移除
    public abstract void display(int depth);// 显示
    public abstract void lineOfDuty();// 职责

}
