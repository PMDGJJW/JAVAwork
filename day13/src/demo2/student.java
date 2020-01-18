package demo2;

public class student implements Comparable<student>{

    private String name;
    private int age;
    private  int score;

    public student() {
    }

    public student(String name, int age, int score) {
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

    @Override
    public int compareTo(student o) {
        int result = this.getAge()-o.getAge();
        if (result==0){
            result = o.getScore()-this.getScore();
        }
        return result;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
