package prototype.memberwisecopy;

/**
 * 原型模式(Prototype):深拷贝
 * 工作经历类
 */
public class WorkExperience implements Cloneable {

    private String workDate;

    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
