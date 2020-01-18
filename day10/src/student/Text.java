package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text {

    public static void main(String[] args) {
        ArrayList<stu>class1=new ArrayList<>();
        ArrayList<stu>class2=new ArrayList<>();
        stu c1s1 = new stu("张一山",17,95);
        stu c1s2 = new stu("杨紫",25,94);
        stu c1s3 = new stu("黄晓明",32,91);
        stu c1s4 = new stu("朗朗",32,99);
        stu c1s5 = new stu("张保",32,95);

        stu c2s1 = new stu("张二哈",15,75);
        stu c2s2 = new stu("张金毛",15,74);
        stu c2s3 = new stu("谢柯基",32,71);
        stu c2s4 = new stu("张拉斯",32,79);
        stu c2s5 = new stu("张拉多",32,73);

        class1.add(c1s1);
        class1.add(c1s2);
        class1.add(c1s3);
        class1.add(c1s4);
        class1.add(c1s5);

        class2.add(c2s1);
        class2.add(c2s2);
        class2.add(c2s3);
        class2.add(c2s4);
        class2.add(c2s5);
        /*创建空的流*/
        Stream <stu>Stuclass = Stream.empty();
        /*拼接一班二班的流 */
        Stuclass=Stream.concat(class1.stream(),class2.stream());
        /*将流转换成集合*/
        List<stu> STUDENT = Stream.concat(class1.stream(),class2.stream()).collect(Collectors.toList());
        /*过滤姓张的同学*/
      Stuclass.filter(n->{
          return n.getName().startsWith("张");
       }).forEach(n->{
           System.out.print(n.getName() +" ");
       });

        System.out.println(" ");
        System.out.println("================");
      /*创建第二个空的流*/
        Stream <stu>agelist = Stream.empty();
        /*排序*/
        agelist = STUDENT.stream().sorted(Comparator.comparing(stu::getAge)
                .reversed().thenComparing(stu::getScore));
        agelist.forEach(s->{
            System.out.println(s.getName()+" , "+s.getAge()+" , "+s.getScore());
        });
        System.out.println("=====================");
        /*创建第三个空的流*/
        Stream <stu>age_18 = Stream.empty();
        age_18 = STUDENT.stream().filter(h->{
            return h.getAge()<18 && h.getName().startsWith("张");
        });
        /*截获3个过滤了小于十八岁和姓张的同学*/
        Stream< stu>age_name = age_18.limit(3);
        age_name.forEach(j->{
            System.out.println(j.getName()+" ，"+j.getAge()+" ，"+j.getScore());
        });
    }

}
