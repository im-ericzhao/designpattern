package composite;

/**
 * 组合模式(Composite)
 * 财务部
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(name + " 公司财务收支管理");
    }

}
