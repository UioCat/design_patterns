package memento;

/**
 * @author uio
 * Date 2021/2/24 20:58
 * Description: 源发器类
 */
public class Emp {
    private String eName;
    private String age;
    private double salary;

    // 进行备忘操作，并返回备忘录对象
    public EmpMemento memento() {
        return new EmpMemento(this);
    }

    // 进行数据恢复，恢复成指定备忘录对象的值
    public void recovery(EmpMemento empMemento) {
        this.eName = empMemento.geteName();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eName='" + eName + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Emp(String eName, String age, double salary) {
        this.eName = eName;
        this.age = age;
        this.salary = salary;
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

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
}
