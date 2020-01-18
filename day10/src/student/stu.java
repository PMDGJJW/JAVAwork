package student;

public class stu {
    private String name;
    private int age;
    private int score;
    public stu() {
    }
    public stu(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
