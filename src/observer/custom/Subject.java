package observer.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author uio
 * Date 2021/2/24 20:32
 * Description:
 */
public class Subject {

    protected List<Observer> list = new ArrayList<>();

    public void register(Observer observer) {
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    /*
    通知所有观察者更新状态
     */
    public void notifyAllObservers() {
        for(Observer observer : list) {
            observer.update(this);
        }
    }

}
