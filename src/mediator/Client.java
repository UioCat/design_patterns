package mediator;

public class Client {
    public static void main(String[] args) {

        Mediator m = new President();

        Department f = new Financial(m);
        Department d = new Development(m);

        f.selfAction();
        f.outAction();

        System.out.println();
        d.selfAction();
        d.outAction();
    }
}
