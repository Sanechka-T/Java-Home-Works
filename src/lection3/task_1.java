package lection3;


abstract class Car{
    private String brand;
    private String model;
    private int power;

    public Car (String b, String m, int p) {
        brand = b;
        model = m;
        power = p;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public int getPower() {
        return power;
    }
}

interface LoadablePassenger{
    void addPassenger();
}

class Bus extends Car implements LoadablePassenger{
    private static int countOfBus = 0;
    private int seats;
    private int numberOfPassengers;

    public Bus (String b, String m, int p, int s){
        super(b,m,p);
        seats = s;
        numberOfPassengers = 0;
        countOfBus += 1;
    }

    public static int getCountOfBus(){
        return countOfBus;
    }

    public int getSeats() {
        return seats;
    }

    public int getNumberOfPassengers(){
        return numberOfPassengers;
    }

    public void addPassenger(){
        if (numberOfPassengers + 1 < seats){
            numberOfPassengers += 1;
        }
        else{
            System.out.println("Превышено число мест в салоне. Пассажир не может войти в автобус!");
        }
    }
}

interface Loadable{
    void loadTruck(int weight);
}

class Truck extends Car implements Loadable{
    private static int countOfLoads = 0;
    private int loadCapacity;
    private int cargoWeight;

    public Truck (String b, String m,int p, int lc){
        super(b,m,p);
        loadCapacity = lc;
        cargoWeight = 0;
    }

    public int getLoadCapacity () {
        return loadCapacity;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public static int getCountOfLoads(){
        return countOfLoads;
    }

    public void loadTruck (int weight){
        if (weight + cargoWeight  > loadCapacity){
            System.out.println("Грузоподъёмность фуры превышена. Нельзя загрузить данный груз.");
        }
        else {
            cargoWeight += weight;
            System.out.println("Загрузка прошла успешно.");
            countOfLoads += 1;
        }
    }
}






