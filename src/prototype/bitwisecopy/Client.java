package prototype.bitwisecopy;

/**
 * 原型模式(Prototype):浅拷贝
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("<-- 浅拷贝 -->");
        Resume r0 = new Resume("大鸟");
        r0.setPersonalInfo("男", "29");
        r0.setWorkExperience("1998-2000", "xx公司");

        Resume r1 = (Resume) r0.clone();
        r1.setWorkExperience("1998-2006", "yy企业");

        Resume r2 = (Resume) r0.clone();
        r2.setPersonalInfo("女", "18");
        r2.setWorkExperience("1998-2003", "zz企业");

        // 浅拷贝中工作经历的显示结果都是最后一次设置的值
        r0.display();
        r1.display();
        r2.display();

    }

}
