package composite;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * 组合模式(Composite)
 * 人力资源部
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        // None
    }

    @Override
    public void remove(Company company) {
        // None
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 员工招聘管理培训");
    }

}
