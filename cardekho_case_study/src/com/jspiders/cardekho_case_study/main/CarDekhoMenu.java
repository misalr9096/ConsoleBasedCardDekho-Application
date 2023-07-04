package com.jspiders.cardekho_case_study.main;

import com.jspiders.cardekho_case_study.operation.CarOperation;
import java.util.Scanner;

public class CarDekhoMenu {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		CarOperation op=new CarOperation();
		
		
		int login=1;
		System.out.println("=========Welcome to CarDekho=========");
		
		while(login==1) {
			
			System.out.println();
			System.out.println("=========Menu=========");
			System.out.println("1.Add Car Details \n2.Search Car Details \n3.Update Car Details \n4.Delete Car Details \n5.Exit");
			System.out.println("Enter Valid Option...!");
			switch(sc.nextInt()) {

			case 1:
				op.addCar();
				break;
			case 2:
				op.searchCar();
				break;
			case 3:
				op.updateCar();
				break;
			case 4:
				op.deleteCar();
				break;
			case 5:
				login=2;
				System.out.println("Thanks for using CarDheko..!");
				break;
			
				
			default:
				System.out.print("Invalid Option..! choose Valid option");
			
			
			}
			
			
			
		}
		
		
		sc.close();
		
	}



	
	
	
	
	
	
}
