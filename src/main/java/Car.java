public class Car {
    String name;
    int age;
    int number;

    public Car(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }
}
