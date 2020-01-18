package Text4;

public class Text4 {
    public static void main(String[] args) {
        Teacher T=new Teacher();
        stuedent s = new stuedent();
        T.setName("王小平");
        T.setClassname("java");
        s.setName("李小乐");
        s.setScore(90);
        System.out.println(T.getName()+"老师"+","+"讲授"+T.getClassname()+"课");
        System.out.println("--------------");
        System.out.println(s.getName()+"同学"+","+"考试得了"+s.getScore()+"分");
    }
}
