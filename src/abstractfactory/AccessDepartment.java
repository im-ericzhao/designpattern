package abstractfactory;

/**
 * 抽象工厂方法(Abstract Factory)
 * AccessDepartment,用于访问Access的Department
 */
public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在Access中给部门表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Access中根据ID得到部门表中的一条记录");
        return null;
    }

}
