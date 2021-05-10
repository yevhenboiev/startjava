public class WolfModTest {
    public static void main(String[] args) {
        WolfMod one = new WolfMod();
        one.setName("Барсик");
        one.setSex("Мужской");
        one.setColor("Черный");
        one.setAge(2);
        one.setWeigth(30);
        one.sit();
        one.move();
        one.run();
        one.howl();
        one.hunt();
        System.out.println("Меня зовут: " + one.getName());
        System.out.println("Мой пол " + one.getSex());
        System.out.println("Моя окрас: " + one.getColor());
        System.out.println("Мой возраст: " + one.getAge());
        System.out.println("Мой вес: " + one.getWeigth());
    }
}