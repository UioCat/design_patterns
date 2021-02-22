package strategy;

/**
 * 实现起来比较容易，如何一般开发人员的思路
 * 加入类型特别多，算法比较复杂， 整个条件会非常复杂，难以维护
 * 如果有新增类型，需要频繁修改此处代码
 * 违反开闭原则
 */
public class TestStrategy {

    public double getPrice(String type, double price) {
        if(type.equals("普通客户小批量")) {
            System.out.println("不打折，原价");
            return price;
        } else if(type.equals("普通客户大批量")) {
            System.out.println("九折");
            return price * 0.9;
        } else if(type.equals("大客户小批量")) {
            System.out.println("八折");
            return price * 0.8;
        } else if(type.equals("大客户大批量")) {
            System.out.println("七折");
            return price * 0.7;
        } else {
            return price;
        }
    }
}
