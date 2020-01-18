public class Manager {
    private String name;
    private  int num;
    private  int gz;
    private  int jz;
    public Manager(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getJz() {
        return jz;
    }

    public void setJz(int jz) {
        this.jz = jz;
    }

    public int getGz() {
        return gz;
    }

    public void setGz(int gz) {
        this.gz = gz;
    }
    public Manager( String name,int gz,int jz,int num ){
        this.name=name;
        this.num=num;
        this.gz=gz;
        this.jz=jz;
    }
    public void intro(){
        System.out.println("经理姓名"+name);
        System.out.println("工号"+num);
    }
    public void showSalary(){
        System.out.println("基本工资为："+gz);
        System.out.println("奖金为"+jz);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码......");
    }
}
