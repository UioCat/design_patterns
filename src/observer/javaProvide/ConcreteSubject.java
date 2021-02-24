package observer.javaProvide;

import java.util.Observable;
import java.util.Observer;

/**
 * @author uio
 * Date 2021/2/24 20:43
 * Description: 目标对象
 */
public class ConcreteSubject extends Observable {

    private int state;

    public void set(int state) {
        this.state = state; //变更目标对象的状态

        setChanged(); //表示目标对象以及发生了变更
        notifyObservers(state); //调用父类的方法，通知所有的观察者
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
