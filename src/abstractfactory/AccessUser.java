package abstractfactory;

/**
 * 抽象工厂方法(Abstract Factory)
 * AccessUser,用于访问Access的User
 */
public class AccessUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在Access中给用户表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据ID得到用户表中的一条记录");
        return null;
    }

}
