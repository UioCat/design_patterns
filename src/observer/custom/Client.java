package observer.custom;

/**
 * @author uio
 * Date 2021/2/24 20:27
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {

        // 目标对象
        ConcreteSubject subject = new ConcreteSubject();

        // 创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        // 让这三个观察者添加到subject对象的观察者队伍中
        subject.register(obs1);
        subject.register(obs2);
        subject.register(obs3);

        // 改变subject的状态
        subject.setState(300);

        // 看看观察者的状态是否改变
        System.out.println("obs1:" + obs1.getMyState());
        System.out.println("obs2:" + obs2.getMyState());
        System.out.println("obs3:" + obs3.getMyState());
    }
}
