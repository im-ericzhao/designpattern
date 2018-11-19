package templatemethod;

/**
 * 模板方法模式(Template Method)
 * 客户端main方法
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("学生A抄的试卷：");
        TestPaper studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("学生B抄的试卷：");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();

    }

}
