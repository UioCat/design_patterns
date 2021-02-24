package observer.javaProvide;

/**
 * @author uio
 * Date 2021/2/24 20:47
 * Description:
 */
public class Client {
    public static void main(String[] args) {

        // 创建目标对象
        ConcreteSubject concreteSubject = new ConcreteSubject();

        // 创建观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        concreteSubject.addObserver(obs1);
        concreteSubject.addObserver(obs2);
        concreteSubject.addObserver(obs3);

        concreteSubject.set(300);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
