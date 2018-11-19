package abstractfactory;

/**
 * 抽象工厂方法(Abstract Factory)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();

        IUser iUser = DataAccess.createUser();
        iUser.insert(user);
        iUser.getUser(1);

        IDepartment iDepartment = DataAccess.createDepartment();
        iDepartment.insert(dept);
        iDepartment.getDepartment(2);
    }

}
