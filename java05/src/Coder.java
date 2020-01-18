public class Coder {
    private String name;
    private  String num;
    private  int gz;
    public Coder(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getGz() {
        return gz;
    }

    public void setGz(int gz) {
        this.gz = gz;
    }
    public Coder( String name,int gz,String num ){
        this.name=name;
        this.num=num;
        this.gz=gz;
    }
    public void intro(){
        System.out.println("程序员姓名"+name);
        System.out.println("工号"+num);
    }
    public void showSalary(){
        System.out.println("基本工资为："+gz);
        System.out.println("奖金为"+"无");
    }
    public void work(){
        System.out.println("正在努力写代码。。。");
    }
}
