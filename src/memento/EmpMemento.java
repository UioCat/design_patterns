package memento;

/**
 * @author uio
 * Date 2021/2/24 21:00
 * Description: 备忘录类
 */
public class EmpMemento {
    private String eName;
    private String age;
    private double salary;

    public EmpMemento(Emp emp) {
        this.eName = emp.geteName();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
