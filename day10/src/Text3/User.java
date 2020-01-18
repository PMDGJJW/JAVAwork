package Text3;

public class User {
    private int id;
    private String UserType;

    public User() {
    }

    public User(int id, String userType) {
        this.id = id;
        UserType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }
}
