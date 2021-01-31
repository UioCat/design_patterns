package adapter;

/**
 * 客户类
 */
public class Client {

    public void test(Target t) {
        t.handleRequest();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee a = new Adaptee();

        Target t1 = new Adapter();
        t1.handleRequest();

        Target t2 = new Adapter2(a);
        t2.handleRequest();

        c.test(t1);
        c.test(t2);
    }
}
