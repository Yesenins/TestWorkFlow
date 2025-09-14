public class Main {
    public static void main(String[] args) {
        User user = new User(18, "Alex", true,
                new UserController("Florida", "USA", "12345"));
        System.out.println(user);
        Car car = new Car("BMW");

    }
}
