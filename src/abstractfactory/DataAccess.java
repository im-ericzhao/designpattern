package abstractfactory;

/**
 * 抽象工厂方法(Abstract Factory)
 * DataAccess,用简单工厂模式实现
 */
public class DataAccess {

    private static final String DB = "SQLSERVER";
//    private static final String DB = "ACCESS";

    public static IUser createUser() {
        IUser result = null;
        switch (DB) {
            case "SQLSERVER":
                result = new SqlServerUser();
                break;
            case "ACCESS":
                result = new AccessUser();
                break;
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (DB) {
            case "SQLSERVER":
                result = new SqlServerDepartment();
                break;
            case "ACCESS":
                result = new AccessDepartment();
                break;
        }
        return result;
    }

}
