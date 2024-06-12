package java;

public class Rental {
  private Car car;
  private Customer c;
  private int rentalDays;
  
  public Rental(Car car, Customer c, int rentalDays) {
    this.car = car;
    this.c = c;
    this.rentalDays = rentalDays;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  public Customer getC() {
    return c;
  }

  public void setC(Customer c) {
    this.c = c;
  }

  public int getRentalDays() {
    return rentalDays;
  }

  public void setRentalDays(int rentalDays) {
    this.rentalDays = rentalDays;
  }
  
  
}
