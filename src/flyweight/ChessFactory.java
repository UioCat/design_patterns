package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂，flyWeightFactory
 */
public class ChessFactory {

    // 享元池
    private static Map<String, Chess> map = new HashMap<>();

    public static Chess getChess(String color) {

        if(map.get(color) != null) {
            // 如果在享元池中有该对象直接返回
            return map.get(color);
        } else {
            Chess chess = new ConcreteChess(color);
            map.put(color, chess);
            return chess;
        }
    }
}
