public class Text06 {
    public static void main(String[] args) {
        Manager Manager= new Manager();
        Manager.setName("James");
        Manager.setNum(9527);
        Manager.setGz(15000);
        Manager.setJz(3000);
        Manager.intro();
        Manager.showSalary();
        Manager.work();
        Coder Coder = new Coder();
        Coder.setName("Kode");
        Coder.setNum("0025");
        Coder.setGz(10000);
        Coder.intro();
        Coder.showSalary();
        Coder.work();
    }
}
