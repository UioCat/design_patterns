package strategy;

/**
 * 普通用于大批量
 */
public class NewCustomerManyStrategy implements Strategy{
    @Override
    public double getPrice(double standerPrice) {
        return standerPrice * 0.9;
    }
}
