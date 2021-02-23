package state;

/**
 * @author uio
 * Date 2021/2/24 02:46
 * Description: 已预定状态
 */
public class BookedState implements State{
    @Override
    public void handle() {
        System.out.println("已预定");
    }
}
