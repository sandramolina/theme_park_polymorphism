package people;

public class Visitor {

    private int age;
    private double height;
    private double money;

    private String visitorName;

    public Visitor(int age, double height, double money, String visitorName) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitorName = visitorName;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public String getVisitorName() {
        return visitorName;
    }
}
