package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式(Composite)
 * 具体公司类
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(sb + name);
        for (Company c : children) {
            c.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company c : children) {
            c.lineOfDuty();
        }
    }
}
