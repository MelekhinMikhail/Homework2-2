import transport.Car;
public class Main {
    public static void main(String[] args) {
        Flower rosa = new Flower("Роза", "Голландия", 35.59, 0);
        Flower hriz = new Flower("Хризантема", "", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gips = new Flower("Гипсофила", "Турция", 19.5, 10);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rosa, 3);
        bouquet.addFlower(hriz, 5);
        bouquet.addFlower(gips, 1);
        bouquet.printBouquet();
        bouquet.infoBouquet();
        System.out.println();

        Car lada = new Car("Lada", "Grande", 1.7, "желтый", 2015, "Россия", "Механика", "хетч-бэк", "а123вк667", 8, true);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4 поколение", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");

        System.out.println(lada);
    }
}