public class Jaeger {

    private String model;
    private String mark;
    private String origin;
    private String launched;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String model, String mark, String origin, String launched, float height, float weight, int speed, int strength, int armor) {
        this.model = model;
        this.mark = mark;
        this.origin = origin;
        this.launched = launched;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public String getOrigin() {
        return origin;
    }

    public String getLaunched() {
        return launched;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStrength() {
        return strength;
    }

    public int getArmor() {
        return armor;
    }

    public void defend() {
        System.out.println("Я защищаю от укуса комара");
    }

    public void kill() {
        System.out.println("Я убиваю комаров, которые мешают спать");
    }

    public void move() {
        System.out.println("Ну я эт, пошел");
    }
}