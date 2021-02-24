package observer.custom;

/**
 * @author uio
 * Date 2021/2/24 20:34
 * Description:
 */
public class ConcreteSubject extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers(); //状态发生变化，通知所以的观察者
    }
}
