package person;


public class Person {
    private final String firstName;
    private final String lastname;
    private final String patronymic;
    private final String birthDate;
    private final char gender;
    private long phone;

    public Person(String firstName, String lastname, String patronymic,
                  String birthDate, char gender, long phone) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public char getGender() {
        return gender;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getFirstName() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", gender=" + getGender() +
                ", phone=" + getPhone() +
                '}';
    }
}
