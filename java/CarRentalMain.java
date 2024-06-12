package java;

public class CarRentalMain {
  public static void main(String[] args) {
    Car c1 = new Car("C001", "650D", "BMW", 2500);
    Car c2 = new Car("C002", "verna", "hyundai", 800);
    Car c3 = new Car("C003", "Q6", "Audi", 2000);
CarRentalManagement cm = new CarRentalManagement();
cm.addCar(c1);
cm.addCar(c2);
cm.addCar(c3);
cm.menu();
    
  }
  
}
