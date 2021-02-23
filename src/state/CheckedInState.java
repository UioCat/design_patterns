package state;

/**
 * @author uio
 * Date 2021/2/24 02:47
 * Description: 已入住
 */
public class CheckedInState implements State{
    @Override
    public void handle() {
        System.out.println("已入住");
    }
}
