package strategy;

/**
 * 普通用户小批量购买
 */
public class NewCustomerFewStrategy implements Strategy{
    @Override
    public double getPrice(double standerPrice) {
        System.out.println("不打折");
        return standerPrice;
    }
}
