package state;

/**
 * @author uio
 * Date 2021/2/24 02:44
 * Description: 空闲状态
 */
public class FreeState implements State{

    @Override
    public void handle() {
        System.out.println("房间空闲");
    }
}
