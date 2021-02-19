package mediator;

/**
 * 中介接口
 */
public interface Mediator {

    void register(String dName, Department p);

    void command(String dName);
}
