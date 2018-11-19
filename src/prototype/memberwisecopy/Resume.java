package prototype.memberwisecopy;

/**
 * 原型模式(Prototype):深拷贝
 * 简历类
 */
public class Resume implements Cloneable {

    private String name;

    private String sex;

    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public Resume(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    // 显示
    public void display() {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
        System.out.println("工作经历：" + workExperience.getWorkDate() + "，" + workExperience.getCompany());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume resume = new Resume(this.workExperience);
        resume.name = this.name;
        resume.sex = this.sex;
        resume.age = this.age;
        return resume;
    }

}
