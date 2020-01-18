package text6;

public class Complane  extends Employee implements Money {
    int emp ;

    public Complane(int emp) {
        this.emp = emp;
    }

    public Complane(String name, double price, int emp) {
        super(name, price);
        this.emp = emp;
    }

    public int getEmp() {
        return emp;
    }

    public void setEmp(int emp) {
        this.emp = emp;
    }

    @Override
    public void paySalary(Employee employee) {
        System.out.println("给"+employee.getName()+"发工资"+employee.getPrice()+"元"+"公司余额"+emp);
    }
}
