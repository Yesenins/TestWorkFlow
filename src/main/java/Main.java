public class Main {
    public static void main(String[] args) {
        User user = new User(18, "Alex", true,
                new UserController("Florida", "USA", "12345"));
        System.out.println(user);
        Car car = new Car("BMW", 12, 1234);
        STO sto = new STO("Azaz");
        Phone phone = new Phone(123136546, "sun");
        System.out.println(phone);
        System.out.println(car + " " +  sto);
    }
}
