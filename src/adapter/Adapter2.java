package adapter;

/**
 * 适配器（对象适配器方式，组合）
 */
public class Adapter2 implements Target{

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
