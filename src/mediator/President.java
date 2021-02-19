package mediator;

import java.util.HashMap;
import java.util.Map;

public class President implements Mediator {

    private Map<String ,Department> map= new HashMap<String, Department>();

    @Override
    public void register(String dName, Department p) {
        map.put(dName, p);
    }

    /**
     * @param dName 需要调用部门的名字
     */
    @Override
    public void command(String dName) {
        // 其它部门可以调用该方法，来让中介者调用其它部门
        map.get(dName).selfAction();
    }
}
