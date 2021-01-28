package singleton;

/**
 * @author uio
 * 懒加载 √
 * 线程安全 X
 */
public class Singleton1 {
    private Singleton1() {} // 构造器私有

    /**
     * 初始化对象为null
     */
    private static Singleton1 instance = null;

    public static Singleton1 getInstance() {
        if(instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
