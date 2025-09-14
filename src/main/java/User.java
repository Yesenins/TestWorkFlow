public class User {
    int age;
    String name;
    boolean isActive;
    UserController userController;

    public User(int age, String name, boolean isActive, UserController userController) {
        this.age = age;
        this.name = name;
        this.isActive = isActive;
        this.userController = userController;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", userController=" + userController +
                '}';
    }
}
