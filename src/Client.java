public class Client {
    private String name;
    private int age;
    private int number;
    private Sub subscription;

    public Client(String name, int age, int number, Sub subscription) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.subscription = subscription;
    }

    public String toString(){
        return String.format("%s/%d/%d/%s", name,age,number,subscription);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Sub getSubscription() {
        return subscription;
    }

    public void setSubscription(Sub subscription) {
        this.subscription = subscription;
    }
}
