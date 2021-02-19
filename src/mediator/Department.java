package mediator;


/**
 * 同事类接口
 */
public interface Department {

    void selfAction(); //做本部门的事情
    void outAction(); //向总经理（中介）发出申请
}
