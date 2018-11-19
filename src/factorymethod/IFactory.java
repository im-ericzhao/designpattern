package factorymethod;

/**
 * 工厂方法模式(Factory Method)
 * 雷锋工厂
 */
public interface IFactory {

    LeiFeng createLeiFeng();

}

/**
 * 学雷锋的大学生工厂
 */
class UndergraduateFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }

}

/**
 * 社区志愿者工厂
 */
class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }

}