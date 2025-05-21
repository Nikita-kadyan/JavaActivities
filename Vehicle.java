class Vehicle {
    String make, model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(make + " " + model + " (" + year + ")");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year) {
        super(make, model, year); // using super
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year) {
        super(make, model, year); // using super
    }
}

public class Experiment2 {
    public static void main(String[] args) {
        // Updated car and bike objects
        Car car = new Car("Mahindra", "Scorpio", 2022);
        Motorcycle bike = new Motorcycle("Royal Enfield", "Classic", 2023);

        car.display();
        bike.display();
    }
}
