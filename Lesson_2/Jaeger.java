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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLaunched() {
        return launched;
    }

    public void setLaunched(String launched) {
        this.launched = launched;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
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