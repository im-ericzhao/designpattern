package templatemethod;

/**
 * 模板方法模式(Template Method)
 * 学生B抄的试卷
 */
public class TestPaperB extends TestPaper {

    @Override
    protected String Answer1() {
        return "c";
    }

    @Override
    protected String Answer2() {
        return "a";
    }

    @Override
    protected String Answer3() {
        return "a";
    }

}
