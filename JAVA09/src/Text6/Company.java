package Text6;

public class Company extends Employee implements Money {
    int emp ;

    public Company(int emp) {
        this.emp = emp;
    }
    public Company(String name, int age, int emp) {
        super(name, age);
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
        setEmp(emp-employee.getAge());
        System.out.println("给"+employee.getName()+employee.getAge()+"元"+"公司余额："+emp);
    }
}
