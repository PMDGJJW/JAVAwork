public class baozi {

    private String name;
    private  int flag;
    private int num;

    public baozi() {
    }

    public baozi(String name, int flag, int num) {
        this.name = name;
        this.flag = flag;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
