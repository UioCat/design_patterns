package proxy.staticProxy;

public class Client {

    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();

        proxy.sing(); // 内部调用了真实的类。在客户端调用代理类的sing方法
    }
}
