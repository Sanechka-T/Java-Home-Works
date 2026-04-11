package lection3;

public class Main {
    public static void main(String[] args) {
        // Тестирование Bus
        System.out.println("=== Тестирование автобуса ===");
        Bus bus1 = new Bus("Mercedes", "Sprinter", 150, 20);
        Bus bus2 = new Bus("Volvo", "B12", 200, 30);

        System.out.println("Создано автобусов: " + Bus.getCountOfBus());
        System.out.println("Автобус: " + bus1.getBrand() + " " + bus1.getModel() +
                ", мощность: " + bus1.getPower() + " л.с.");
        System.out.println("Количество мест: " + bus1.getSeats());
        System.out.println("Пассажиров: " + bus1.getNumberOfPassengers());

        for (int i = 0; i < 22; i++) {
            System.out.print("Попытка " + (i+1) + ": ");
            bus1.addPassenger();
        }
        System.out.println("Итоговое количество пассажиров: " + bus1.getNumberOfPassengers());

        // Тестирование Truck
        System.out.println("\n=== Тестирование грузовика ===");
        Truck truck1 = new Truck("Volvo", "FH16", 500, 10000);
        Truck truck2 = new Truck("Scania", "R450", 450, 8000);

        System.out.println("Грузовик: " + truck1.getBrand() + " " + truck1.getModel());
        System.out.println("Грузоподъемность: " + truck1.getLoadCapacity() + " кг");
        System.out.println("Текущий вес груза: " + truck1.getCargoWeight() + " кг");

        // Загружаем груз
        truck1.loadTruck(3000);
        truck1.loadTruck(5000);
        truck1.loadTruck(3000);

        System.out.println("Итоговый вес груза: " + truck1.getCargoWeight() + " кг");
        System.out.println("Всего успешных загрузок: " + Truck.getCountOfLoads());

    }
}