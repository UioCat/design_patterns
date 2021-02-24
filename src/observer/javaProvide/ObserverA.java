package observer.javaProvide;

        import java.util.Observable;
        import java.util.Observer;

/**
 * @author uio
 * Date 2021/2/24 20:45
 * Description: 观察者
 */
public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
