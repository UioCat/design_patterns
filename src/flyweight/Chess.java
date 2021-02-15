package flyweight;

/**
 * 享元类
 */
public interface Chess {
    void setColor(String color);
    String getColor();
    void display(Coordinate coordinate);
}

/**
 * 具体的享元类 concreteFlyWeight
 */
class ConcreteChess implements Chess {

    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("颜色：" + color);
        System.out.println("位置：" + coordinate.getX() + coordinate.getY());
    }
}