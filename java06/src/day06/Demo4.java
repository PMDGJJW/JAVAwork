package day06;

public class Demo4 {
    public static void main(String[] args) {
        Student [] students = new Student[3];
        Student s1=new Student("张三",40);
        Student s2=new Student("李氏",50);
        Student s3=new Student("王五",60);

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for (int i=0;i<students.length;i++){
            Student s=students[i];
            System.out.println("姓名："+s.getName()+"年龄"+s.getAge());
        }
    }
}
