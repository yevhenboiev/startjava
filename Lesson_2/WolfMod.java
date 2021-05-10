public class WolfMod {
    private String name;
    private String sex;
    private String color;
    private int age;
    private int weigth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        if (age < 8) {
            System.out.println("Неккоректный возраст");
        } else {
        this.age = age;
        }
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void sit() {
        System.out.println("Я хороший, я сижу");
    }

    public void move() {
        System.out.println("Я иду");
    }

    public void run() {
        System.out.println("Я бегу");
    }

    public void howl() {
        System.out.println("Я вою");
    }

    public void hunt() {
        System.out.println("Я машина, я охотник");
    }
}