package templatemethod;

/**
 * 模板方法模式(Template Method)
 * 学生A抄的试卷
 */
public class TestPaperA extends TestPaper {

    @Override
    protected String Answer1() {
        return "b";
    }

    @Override
    protected String Answer2() {
        return "c";
    }

    @Override
    protected String Answer3() {
        return "a";
    }

}
