public class Variable {
    public static void main(String[] args) {
        byte coresCount = 4;
        short amountOfRam = 8;
        int typeSystem = 64; //бит
        long numberCore = 6006;
        double frequency = 2.0;
        float frequencyFloat = 2.0f;
        String nameCore = "i3-6060U";
        boolean power = true;
        char numCore = 'U';

        System.out.println("Количество ядер: " + coresCount + 
                "\nКоличество оперативной памяти: " + amountOfRam + "Гб" + 
                "\nРазрядность системы: " + typeSystem + "бит");
        System.out.println("Номер процессора: " + numberCore + 
                "\nЧастота процессора: " + frequency + "Ггц" + 
                "\nНазвание процессора: "+ nameCore);
        System.out.println("Состояние питания: " + power + "\nПриставка процессора: " + numCore);
    }
}