package java;

public class Customer {
  private String customerName;
  private int Custnumber;
private boolean adhaarSubmit;



public Customer(String customerName, int custnumber, boolean adhaarSubmit) {
  this.customerName = customerName;
  Custnumber = custnumber;
  this.adhaarSubmit = true;
}

public String getCustomerName() {
  return customerName;
}
public void setCustomerName(String customerName) {
  this.customerName = customerName;
}
public int getCustnumber() {
  return Custnumber;
}
public void setCustnumber(int custnumber) {
  Custnumber = custnumber;
}
public boolean isAdhaarSubmit() {
  return adhaarSubmit;
}
public void setAdhaarSubmit(boolean adhaarSubmit) {
  this.adhaarSubmit = adhaarSubmit;
}
}
