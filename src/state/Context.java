package state;

/**
 * @author uio
 * Date 2021/2/24 02:47
 * Description: 维持不同状态之间的切换
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
        state.handle();
    }
}
