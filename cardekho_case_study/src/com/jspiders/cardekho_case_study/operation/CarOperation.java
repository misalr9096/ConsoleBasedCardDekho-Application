package com.jspiders.cardekho_case_study.operation;
import com.jspiders.cardekho_case_study.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class CarOperation {
	
	Scanner sc=new Scanner(System.in);
	
	private static List<Car> db = new ArrayList<Car>();
	
	public void addCar() {
		
		System.out.println("How many cars you would want to add ?");
		int n=sc.nextInt();
	
		for(int i=1;i<=n;i++) {
			
			System.out.println("Enter the Car id : ");
			int cid=sc.nextInt();
			System.out.println("Enter the Car Name :");
			String name=sc.next();
			System.out.println("Enter the Car Model :");
			String model=sc.next();
			System.out.println("Enter the Brand Of the Car : ");
			String brand=sc.next();
			System.out.println("Enter the Fule type of Car : ");
			String fuletype=sc.next();
			System.out.println("Enter the Price : ");
			double price=sc.nextDouble();
			
			db.add(new Car(cid,name,model,brand,fuletype,price));
			
			System.out.println("Car Added..!");
		}
		
		
		
	}
	
	public void display(ArrayList<Car> car) {
			
		System.out.println("======Result======");
		for(Car c:car) {
			System.out.println(c);
		}
		
		
	}
	public void searchCar() {
		
		if(db.isEmpty()) {
			System.out.println("Cars Not Avaibales..!");
		}
		else {
			System.out.println("=========Serach By=========");
			System.out.println("1.Name \n2.Brand \n3.Fule Type \n4.Go Back");
			System.out.println("Enter the valid choice..!");
			switch(sc.nextInt()) {
				
			case 1:
				System.out.println("Enter the Car name..!");
				String name=sc.next();
				ArrayList<Car>cars=new ArrayList<>();
				for(Car c:db) {
					if(c.getName().equalsIgnoreCase(name)) {
						cars.add(c);
					}
				}
				display(cars);
				break;
			case 2:
				System.out.println("Enter the Car brand..!");
				String brand=sc.next();
				ArrayList<Car>cars1=new ArrayList<>();
				for(Car c:db) {
					if(c.getBarnd().equalsIgnoreCase(brand)) {
						cars1.add(c);
					}
				}
				display(cars1);
				break;
			case 3:
				System.out.println("Enter the Car Fuletype..!");
				String fuletype=sc.next();
				ArrayList<Car>cars2=new ArrayList<>();
				for(Car c:db) {
					if(c.getFule_type().equals(fuletype)) {
						cars2.add(c);
					}
				}
				display(cars2);
				break;
			case 4:
				return;
			default:
				System.out.println("Enter the valid choice..!");
			
			}
			
		}
		
	
	}
	
	public void updateCar() {
		
		if(db.isEmpty()) {
			
			System.out.println("Cars Not Avaibales..!");
		}else {
			
			this.avaiableCars();
			
			System.out.println("Enter the Car id to update Car details..!");
			int c_id=sc.nextInt();
			
			for(Car c:db) {
				
				if(c.getCar_id()==c_id) {
					
					System.out.println("What would you like to update..!");
					System.out.println("1.Name \n2.Model \n3.Brand \n4.Fule Type \n5.Price");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter the name");
						c.setName(sc.next());
						System.out.println("Name Updated..!");
						break;
					case 2:
						System.out.println("Enter the Model");
						c.setModel(sc.next());
						System.out.println("Model Updated..!");
						break;
					case 3:
						System.out.println("Enter the Brand");
						c.setBarnd(sc.next());

						System.out.println("Brand Updated..!");
						break;
					case 4:
						System.out.println("Enter the Fule Type");
						c.setFule_type(sc.next());

						System.out.println("Fule Type Updated..!");
						break;
					case 5:
						System.out.println("Enter the Price");
						c.setPrice(sc.nextDouble());

						System.out.println("Price Updated..!");
						break;
					default:
						System.out.println("Enter the valid choice..!");
					}
					
					
				}else{	
					System.out.println("Car Details not found..!");
				}
				
			}
			
			
		}
	
	}
	
	public void deleteCar() {
		
		if(db.isEmpty()) {
			System.out.println("Cars Not Avaibales..!");
		}
		else {
			this.avaiableCars();
			System.out.println("Enter the Car id to delete the Car details");
			int c_id=sc.nextInt();
			
			for(Car c:db) {
				if(c.getCar_id()==c_id) {
					db.remove(c);
					System.out.println("Car Details Deleted ...!");
					break;
				}else {
					System.out.println("Car Details not Found..!");
				}
			}
			
		}
		
	
		
	}
	
	public void avaiableCars() {
		
		System.out.println("==========Avaibale Cars==========");
		
		if(db.isEmpty()) {
			System.out.println("Cars Not Avaibales..!");
		}
	
		for(Car c:db) {
			System.out.println(c);
		}
	}
}
