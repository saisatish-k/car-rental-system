package java;

public class Car {
private String id,model,brand;
private double BasePrice;
private boolean isAvailable;

public Car(String id, String model, String brand, double basePrice) {
  this.id = id;
  this.model = model;
  this.brand = brand;
  BasePrice = basePrice;
  this.isAvailable = true;
}

public String getId() {
  return id;
}

public void setId(String id) {
  this.id = id;
}

public String getModel() {
  return model;
}

public void setModel(String model) {
  this.model = model;
}

public String getBrand() {
  return brand;
}

public void setBrand(String brand) {
  this.brand = brand;
}

public double getBasePrice() {
  return BasePrice;
}

public void setBasePrice(double basePrice) {
  BasePrice = basePrice;
}

public boolean isAvailable() {
  return isAvailable;
}

public void setAvailable(boolean isAvailable) {
  this.isAvailable = isAvailable;
}

public void giveCar(){
  isAvailable = false;
}

public void returnCar(){
  isAvailable = true;
}

public double rentalPrice(int days){
  return days*BasePrice;
}



  
}