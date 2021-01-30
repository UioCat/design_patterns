package prototype;

import java.util.Date;

/**
 * 原型模式 浅克隆
 * 测试原型模式
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(111111111L);

        Sheep sheep = new Sheep("sheep1", date);
        System.out.println(sheep);
        Sheep s2 = (Sheep) sheep.clone();
        System.out.println(s2);
        // 地址与sheep不同

        date.setTime(222222222L);
        System.out.println(sheep.getBirthday());
        System.out.println(s2.getBirthday());
        // 两者的birthday属性都变了，因为是浅克隆，只克隆了引用的地址，没有克隆引用的对象（两者引用了同一个对象date)

        /*
        prototype.Sheep@61bbe9ba
        prototype.Sheep@610455d6
        Sat Jan 03 21:43:42 CST 1970
        Sat Jan 03 21:43:42 CST 1970
         */
    }
}
