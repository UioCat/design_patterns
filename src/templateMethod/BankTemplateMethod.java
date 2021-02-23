package templateMethod;

/**
 * @author uio
 * Date 2021/2/24 02:20
 * Description: 模版方法
 */
public abstract class BankTemplateMethod {

    public void takeNumber() {
        System.out.println("排队取号");
    }

    public abstract void transact(); //办理具体的业务

    public void evaluate() {
        System.out.println("反馈评分");
    }

    // 模版方法，把基本的操作组合到一起，子类一般不能重写
    public final void process() {
        this.takeNumber();
        this.transact(); //像一个钩子，执行时挂哪个子类的方法就调用哪个子类
        this.evaluate();
    }
}
