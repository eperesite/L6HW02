package l2hw01;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new Phone("+375 29 312 15 73", "Samsung S 21", 1.69);
        Phone phone2 = new Phone("+375 44 854 45 74", "iPhone 14", 1.72);
        Phone phone3 = new Phone("+375 25 456 15 75", "Google Pixel XL ", 1.68);

        System.out.println("Телефоны:");
        System.out.println("Phone 1: Номер - " + phone1.getNumber() + ", Модель - " + phone1.getModel() + ", Вес - " + phone1.getWeight());
        System.out.println("Phone 2: Номер - " + phone2.getNumber() + ", Модель - " + phone2.getModel() + ", Вес - " + phone2.getWeight());
        System.out.println("Phone 3: Номер - " + phone3.getNumber() + ", Модель - " + phone3.getModel() + ", Вес - " + phone3.getWeight());

        phone1.receiveCall("Маргарита");
        phone2.receiveCall("Матвей");
        phone3.receiveCall("Настя", "+375 29 754 44 10");

        phone1.sendMessage("+7 5 145 25 14", "+375 29 457 25 47", "+61 48 261 85 00");
    }

}
