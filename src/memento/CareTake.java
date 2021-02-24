package memento;

/**
 * @author uio
 * Date 2021/2/24 21:03
 * Description: 负责人类，负责管理备忘录对象
 */
public class CareTake {
    private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
