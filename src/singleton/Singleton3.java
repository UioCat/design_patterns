package singleton;



/**
 * @author uio
 * 线程安全√
 * 懒加载 √
 * 双检锁
 */
public class Singleton3 {
    /**
     *  volatile 防止指令重排，可以防止其他线程在getInstance()上面一个if判断时，false，直接return，而此时singleton还是null
     */
    private volatile static Singleton3 singleton3;

    private Singleton3(){};

    public static Singleton3 getInstance() {
        // 双检锁
        if(singleton3 == null) {
            synchronized (Singleton3.class) {
                if(singleton3 == null) {
                    // 不加里面的判空会出现在没有锁住时，已经有线程进入了上面的一个if，重而多次创建对象
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}