public class Phone {
    int phoneNumber;
    String namePhone;

    public Phone(int phoneNumber, String namePhone) {
        this.phoneNumber = phoneNumber;
        this.namePhone = namePhone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber=" + phoneNumber +
                ", namePhone='" + namePhone + '\'' +
                '}';
    }
}
