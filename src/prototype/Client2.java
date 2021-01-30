package prototype;

import java.util.Date;

/**
 * 原型模式 深复制
 */
public class Client2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(111111111L);

        Sheep2 sheep = new Sheep2("sheep1", date);
        System.out.println(sheep);
        Sheep2 s2 = (Sheep2) sheep.clone();
        System.out.println(s2);
        // 地址与sheep不同

        date.setTime(222222222L);
        System.out.println(sheep.getBirthday());
        System.out.println(s2.getBirthday());

        /*
        prototype.Sheep2@61bbe9ba
        prototype.Sheep2@610455d6
        Sat Jan 03 21:43:42 CST 1970
        Fri Jan 02 14:51:51 CST 1970
         */
    }
}
