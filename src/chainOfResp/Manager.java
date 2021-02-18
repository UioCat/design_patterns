package chainOfResp;

/**
 * 经理
 */
public class Manager extends Leader{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays() < 10) {
            System.out.println("员工：" + request.getEmpName() + "请假");
            System.out.println("经理：" + this.name + "审批");
        } else {
            // 其他内容
        }
    }
}
