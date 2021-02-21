package interpreter;

public class Scale extends Expression {
    @Override
    public void execute(String key, double value) {
        // 如果获得的 key 为O, value 为1 则演奏低音
        String note = "";
        switch ((int)value) {
            case 1:
                note = "低音";
                break;
            case 2:
                note = "中音";
                break;
            case 3:
                note = "高音";
                break;
        }
        System.out.print(note + " ");
    }
}