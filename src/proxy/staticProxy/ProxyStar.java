package proxy.staticProxy;

/**
 * 代理明星
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        super();
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.sign");
    }

    /**
     * 调用真实对象的sing方法
     */
    @Override
    public void sing() {
        star.sing();
    }
}
