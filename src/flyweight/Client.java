package flyweight;

public class Client {

    public static void main(String[] args) {
        Chess chess1 = ChessFactory.getChess("黑色");
        Chess chess2 = ChessFactory.getChess("黑色");

        // 内部状态
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态----------------");
        chess1.display(new Coordinate(10, 20));
        chess2.display(new Coordinate(10, 30));
    }
}
