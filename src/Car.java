public class Car {
    //Create a Class Car that would have the following fields: carPrice and
    //color and method calculateSalePrice() which should be returning a
    //price of the car.
    //Create 2 subclasses: Sedan and Truck. The Truck class has a field
    //as weight and has its own implementation of calculateSalePrice()
    //method in which returned price is calculated as following: if
    //weight>2000 then returned price car should include 10% discount,
    //otherwise 20% discount.
    //The Sedan class has field as length and also does it,s own
    //implementation of calculateSalePrice(): if length of sedan is >20 feet
    //then returned car price should include 5% discount, otherwise 10%
    //discount

    private int carPrice;
    private String carColor;

    public Car(int carPrice, String color) {
        this.carPrice = carPrice;
        this.carColor = carColor;
    }
     double calculateSalePrice() {
        return carPrice;

    }
}
class Truck extends Car {
    private double weight;

    public Truck(double weight, int carPrice, String carColor) {
        super(carPrice, carColor);
        this.weight = weight;
    }

    @Override
     double calculateSalePrice() {
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.10;
        } else {
            return super.calculateSalePrice() * 0.20;
        }
    }
}
class sedan extends Car{
    private int length;
    public sedan(int length,int carPrice, String carColor) {
        super(carPrice, carColor);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            return super.calculateSalePrice()*0.05;
        }else{
        return super.calculateSalePrice()*0.10;
    }
}}
class Tester{
    public static void main(String[] args) {
        Truck t=new Truck(70000,80000,"Black");
        System.out.println("Truck sale price " +t.calculateSalePrice());
        sedan s=new sedan(14,74410,"white");
        System.out.println("sedan sale price " +s.calculateSalePrice());

    }
}