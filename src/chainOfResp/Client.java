package chainOfResp;

public class Client {
    public static void main(String[] args) {
        Leader a = new Manager("张三");
        Leader b = new Director("李四");

        // 组织责任链对象关系
        a.setNextLeader(b);


        // 开始请假操作
        LeaveRequest request1 = new LeaveRequest("Tom", 5, "回家");
        a.handleRequest(request1);
    }
}
