package factorymethod;

/**
 * 工厂方法模式(Factory Method)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        // 大学生
        IFactory undergraduateFactory = new UndergraduateFactory();
        LeiFeng student = undergraduateFactory.createLeiFeng();
        student.sweep();
        student.wash();
        student.buyRice();
        // 志愿者
        IFactory volunteerFactory = new VolunteerFactory();
        LeiFeng volunteer = volunteerFactory.createLeiFeng();
        volunteer.sweep();
        volunteer.wash();
        volunteer.buyRice();
    }

}
