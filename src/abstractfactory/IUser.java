package abstractfactory;

/**
 * 抽象工厂方法(Abstract Factory)
 * 用户接口
 */
public interface IUser {

    void insert(User user);

    User getUser(int id);

}
