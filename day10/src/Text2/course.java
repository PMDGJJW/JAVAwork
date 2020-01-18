package Text2;

import java.util.ArrayList;

public class course {
        private String classname;
        private String teacherName;

    public course() {
    }

    public course(String classname, String teacherName) {
        this.classname = classname;
        this.teacherName = teacherName;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void show(ArrayList<student> clist){
        System.out.println("课程名称："+classname);
        System.out.println("授课老师："+teacherName);
        for (int i = 0; i <clist.size() ; i++) {
            if (clist.get(i).getNum()==1){
                System.out.println("上课："+clist.get(i).getName());
            }
           else {
                System.out.println("旷课："+clist.get(i).getName());
            }
        }
    }
}
