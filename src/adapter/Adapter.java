package adapter;

/**
 * 适配器（类适配器，用继承的方式实现）
 */
public class Adapter extends Adaptee implements Target{

    @Override
    public void handleRequest() {
        super.request();
    }
}
