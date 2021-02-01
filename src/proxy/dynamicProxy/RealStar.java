package proxy.dynamicProxy;

/**
 * 真实的明星类
 */
public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("RealStar.Confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.sign()");
    }

    @Override
    public void sing() {
        System.out.println("RealStar.sing()");
    }
}
