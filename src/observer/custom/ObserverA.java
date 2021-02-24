package observer.custom;

/**
 * @author uio
 * Date 2021/2/24 20:36
 * Description:
 */
public class ObserverA implements Observer{

    private int myState; //myState需要跟目标对象的state保持一直

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
