package memento;


/**
 * @author uio
 * Date 2021/2/24 21:04
 * Description:
 */
public class Client {

    public static void main(String[] args) {
        CareTake careTake = new CareTake();

        Emp emp = new Emp("小明", "18", 900.0);
        System.out.println("第一次打印对象" + emp.toString());

        careTake.setMemento(emp.memento()); //备份操作

        emp.setAge("38");
        emp.seteName("小红");

        System.out.println("第二次打印对象" + emp.toString());

        emp.recovery(careTake.getMemento()); //恢复备忘录管理对象管理的备忘录的值
        System.out.println("第三次打印对象" + emp.toString());

    }
}
