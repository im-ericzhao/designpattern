package abstractfactory;

/**
 * 抽象工厂方法(Abstract Factory)
 * 部门接口
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);

}
