package interpreter;

public abstract class Expression {

    public void interpret(PlayContext context) {
        if (context.getText().length() <= 0) {
            return;
        } else {
            // 当前演奏文本的第一条命令字母和参数值
            // 例如 O 3 G 0.5 A 0.5 E 3
            // 则 playKey 为 O, playValue 为 3
            String playKey = context.getText().substring(0, 1);
            context.setText(context.getText().substring(2));
            double playValue = Double.valueOf(context.getText().substring(0, context.getText().indexOf(" ")));
            execute(playKey, playValue);
            context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
        }
    }

    // 执行
    public abstract void execute(String key, double value);
}