package User_package;

public class User {
    private String user_name ;
    private int user_age;

    public User(String user_name, int user_age) {
        this.user_name = user_name;
        this.user_age = user_age;
    }

    public String getUser_name() {
        return user_name;
    }

    public int getUser_age() {
        return user_age;
    }
}
