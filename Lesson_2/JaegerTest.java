public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger gipsy = new Jaeger();
        gipsy.setModel("Gipsy Danger");
        gipsy.setMark("Mark-3");
        gipsy.setOrigin("USA");
        gipsy.setLaunched("July 10, 2017");
        gipsy.setHeight(79.25f);
        gipsy.setWeight(1.980f);
        gipsy.setSpeed(7);
        gipsy.setStrength(8);
        gipsy.setArmor(6);
        gipsy.kill();
        gipsy.defend();
        gipsy.move();
        System.out.println("=============================================================");
        System.out.println("Моя модель: " + gipsy.getModel());
        System.out.println("Я произведен в : " + gipsy.getOrigin());
        System.out.println("Моя высота " + gipsy.getHeight() + " метров");
        System.out.println("Мой вес: " + gipsy.getWeight() + " тонны");
        System.out.println("Моя скорость: " + gipsy.getSpeed());
        System.out.println("Моя : " + gipsy.getSpeed());
        System.out.println("Моя скорость: " + gipsy.getSpeed());
        System.out.println("Моя сила: " + gipsy.getStrength());
        System.out.println("Моя броня: " + gipsy.getArmor());
        System.out.println("=============================================================");

        Jaeger cherno = new Jaeger();
        cherno.setModel("Cherno Alpha");
        cherno.setMark("Mark-1");
        cherno.setOrigin("Russia");
        cherno.setLaunched("2015");
        cherno.setHeight(85.34f);
        cherno.setWeight(2.41f);
        cherno.setSpeed(3);
        cherno.setStrength(10);
        cherno.setArmor(10);
        cherno.kill();
        cherno.defend();
        cherno.move();
        System.out.println("=============================================================");
        System.out.println("Моя модель: " + cherno.getModel());
        System.out.println("Я произведен в : " + cherno.getOrigin());
        System.out.println("Моя высота " + cherno.getHeight() + " метров");
        System.out.println("Мой вес: " + cherno.getWeight() + " тонны");
        System.out.println("Моя скорость: " + cherno.getSpeed());
        System.out.println("Моя : " + cherno.getSpeed());
        System.out.println("Моя скорость: " + cherno.getSpeed());
        System.out.println("Моя сила: " + cherno.getStrength());
        System.out.println("Моя броня: " + cherno.getArmor());
        System.out.println("=============================================================");

    }
}