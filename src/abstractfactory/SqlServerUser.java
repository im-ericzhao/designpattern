package abstractfactory;

/**
 * 抽象工厂方法(Abstract Factory)
 * SqlServerUser,用于访问SQL Server的User
 */
public class SqlServerUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中根据ID得到User表中的一条记录");
        return null;
    }

}
