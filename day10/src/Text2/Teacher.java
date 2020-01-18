package Text2;

import java.util.ArrayList;

public class Teacher  {
    private String tname;

    public Teacher() {
    }

    public Teacher(String tname) {
        this.tname = tname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
    public ArrayList<student> check(ArrayList<student> list,String name){
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getName()==name){
                list.get(i).setNum(1);

            }
        }
        return list;
    }
}
