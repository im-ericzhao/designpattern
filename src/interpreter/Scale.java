package interpreter;

/**
 * 解释器模式(Interpreter)
 * 音阶类
 */
public class Scale extends Expression {

    @Override
    public void excute(String key, double value) {
        String scale = "";
        switch ((int) value) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
                throw new RuntimeException("Exception");
        }
        System.out.print(scale + " ");
    }

}
