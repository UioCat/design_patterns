package mediator;

/**
 * 研发部门
 */
public class Development implements Department{

    private Mediator mediator; //持有中介者

    public Development(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("development部门", this); // 注册中介
    }

    @Override
    public void selfAction() {
        System.out.println("研究研发项目");
    }

    @Override
    public void outAction() {
        System.out.println("申请资金支持");
        mediator.command("Financial部门");

    }
}
