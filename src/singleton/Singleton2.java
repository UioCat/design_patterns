package singleton;

/**
 * @author uio
 * 懒加载 X
 * 线程安全 √
 * 在编译器直接构建
 */
public class Singleton2 {
    private Singleton2() {} // 构造器私有

    private static Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance() {
        return instance;
    }
}