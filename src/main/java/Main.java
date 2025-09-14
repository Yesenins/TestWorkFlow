public class Main {
    public static void main(String[] args) {
        User user = new User(18, "Alex", true,
                new UserController("Florida", "USA", "12345"));
        System.out.println(user);
        Car car = new Car("BMW");
        STO sto = new STO("Azaz");
        System.out.println(car + " " +  sto);

        System.out.println(car +" " + user);
    }
}
