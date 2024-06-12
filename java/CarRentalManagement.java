package java;
import java.util.Scanner;
import java.util.ArrayList;

public class CarRentalManagement {

	ArrayList<Car> cars = new ArrayList<>();
ArrayList<Customer> customers = new ArrayList<>();
	ArrayList<Rental> rentals = new ArrayList<>();
	  Scanner sc = new Scanner(System.in);
	  
	  public void addCar(Car car){
	    cars.add(car);
	  }
	  int rentalDays;
	  Customer tempCustomer =null;
	  Car selectedCar=null;
	  Rental tempRental =null;

	  public void addCustomer(Customer c){
	    customers.add(c);
	  }

	  //rentCar
	  
	  public void rentCar(Car c, Customer c1,int days){
	    if(c.isAvailable()){
	      c.giveCar();
	      rentals.add(new Rental(c, c1, days));
	    }
	      else System.out.println("car is not available");

	    }
	  
	  
	  //returnRentedCar

	    public void returnRentedCar(Car c){
	    	try {
	    		if(c.isAvailable())
	    	        System.out.println("car was not rented");
	    		else {
	    			c.returnCar();
	    		System.out.println("car has been returned");
	    		for(Rental r: rentals){
		            if(r.getCar().equals(c))
		            	tempRental=r;
		            break;
		          }
		              rentals.remove(tempRental);
		              
		          }
	    		
	    	}
	    	catch(Exception e){
	    		System.out.println("car was not rented");
	    	}
	    }
	        

	    
	    
	    //Customer details

	    
	        public void customerDetails()
	        {
	        System.out.println("enter your name");
	        sc.nextLine();
	        String CustomerName =sc.nextLine();
	        System.out.println("enter your number");
	        int CustomerNumber =sc.nextInt();
	        
	  aadh();
	  tempCustomer = new Customer(CustomerName, CustomerNumber, aadhaarSub);
	  customers.add(tempCustomer);
	      }



	        boolean aadhaarSub;

	        //aadh()
	        
	        
	        public void aadh(){
	        sc.nextLine();
	        System.out.println("submit your aadhaar\nEnter y if submitted else enter n");
	        String Sub =sc.nextLine();
	        if(Sub.equalsIgnoreCase("y")){
	          aadhaarSub =true;
	          System.out.println("aadhaar submitted");
	        }
	        else if(Sub.equalsIgnoreCase("n")){
	          aadhaarSub =false;
	          System.out.println("aadhaar submission is required");
	          aadh();
	        }
	        else {
	          System.out.println("incorrect input");
	          aadh();
	        }
	      }

	      // CarDetails

	    public void carDetails(){
	      System.out.println("select a car");
	      System.out.println("Available cars");
	      for (Car c : cars) {
	        if(c.isAvailable()){
	          System.out.println(c.getId()+"  "+c.getModel()+"  "+c.getBrand()+"  "+c.getBasePrice());
	        }
	      }
	    System.out.println("enter the car id to rent");
	      String cid = sc.next();
	      
	      for (Car c : cars) {
	        if(c.getId().equalsIgnoreCase(cid) && c.isAvailable())
	          selectedCar =c;
	        }
	      if(selectedCar ==null) {
	    	  System.out.println("Invalid car id");
	    	  carDetails();
	      }
	        customerDetails();
	        System.out.println("enter rental days:");
	         rentalDays=sc.nextInt();

	      }
	    

	    //BookingDetails
	    
	    private void bookingDetails() {
	    System.out.println(tempCustomer.getCustomerName());
	    System.out.println(selectedCar.getModel());
	    System.out.println(selectedCar.rentalPrice(rentalDays));
	    System.out.println("confirm to rent this car \n enter 'y' to confirm or enter 'n' to main menu");
	    sc.nextLine();
	    String con=sc.nextLine();
	    if(con.equalsIgnoreCase("y"))
	    System.out.println("rented "+selectedCar.getModel()+" at a price "+selectedCar.rentalPrice(rentalDays)+" for"+rentalDays+"days");
	    else{
	      System.out.println("rental cancelled");
	      selectedCar.returnCar();
	      customers.remove(tempCustomer);
	      menu();
	    }
	    
	    }


	    //returnProcess
	    
	    
	    private void returnProcess() {
	    	sc.nextLine();
	      System.out.println("enter customer number to return");
	      int rcus =sc.nextInt();
	      for(Customer c: customers){
	    	  if(rcus == c.getCustnumber())
	    		  tempCustomer =c;
	    	  else {System.out.println("wrong details \n Exited... ");
	    	  System.exit(1);}
	    	  break;
	      }
	      aadhaarSub=false;
	      customers.remove(tempCustomer);
	      sc.nextLine();
	      System.out.println("enter car id to return");
	      String rcar =sc.nextLine();
	      for(Car c: cars){
	        if(c.getId().equals(rcar)) 
	        	selectedCar =c;
	        break;
	      }
	        returnRentedCar(selectedCar);
	      }
	      
	      
	         //menu
	    

	        public void menu(){
	          while(true){
	          System.out.println("---------------------");
	          System.out.println("    CarRentalServices   ");
	          System.out.println("---------------------");
	          System.out.println("choose a option");
	          System.out.println("1. rent a car");
	          System.out.println("2.return a car");
	          System.out.println("3.exit");
	          
	          int option = sc.nextInt();
	          
	switch (option) {
	  case 1: 
	  carDetails();
	  rentCar(selectedCar,tempCustomer,rentalDays);
	  bookingDetails();
	  System.out.println("\nThank you for using the Car Rental System!");
	    break;

	    case 2: 
	    returnProcess();
	    System.out.println("\nThank you for using the Car Rental System!");
	    break;
	    case 3:
	    	sc.nextLine();
	    	System.out.println("Exited....");
	    	System.exit(0); 
	  default: System.out.println("invalid choice");
	    break;
	}
	        }
	      }
	        }