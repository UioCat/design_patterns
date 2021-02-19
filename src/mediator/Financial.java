package mediator;

public class Financial implements Department {

    private Mediator mediator;

    public Financial(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("Financial部门", this);
    }

    @Override
    public void selfAction() {
        System.out.println("审批资金");
    }

    @Override
    public void outAction() {
        // 调用中介者
        mediator.command("development部门");
    }
}
