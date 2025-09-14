public class User {
    int age;
    String name;
    boolean isActive;

    public User(int age, String name, boolean isActive) {
        this.age = age;
        this.name = name;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
