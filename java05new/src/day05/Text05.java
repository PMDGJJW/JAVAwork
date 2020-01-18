package day05;

public class Text05 {
    public static void main(String[] args) {

        Manager M=new Manager("James",9572,15000,3000);
        M.intro();
        M.showSalary();
        M.work();
        Coder O=new Coder( "kode","0025",10000);
        O.intro();
        O.showSalary();
        O.work();
    }
}
