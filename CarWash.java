import java.util.Arrays;
import java.util.Scanner;

public class CarWash {
		
	public static void main(String[] args) {
		String letter = "";
		boolean close = false;
		int carsAdded = 0;
		int indexCarFound = 0;
		
		Car [] carArray = new Car[3];
		
		
		
		while(close == false ) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Welcome to the Car Wash Application");
			System.out.println("----------------------------------------------");
			System.out.println("What do you want to do ?");
			System.out.println("Enter A to add a new car");
			System.out.println("Enter B to change a car detailer");
			System.out.println("Enter C to print all cars info");
			System.out.println("Enter N to quit");
			
			letter = in.next().toUpperCase();
			Car car = new Car();
			Detailer detailer = new Detailer();
			
			if (letter.equals("A")) {
				
				
				System.out.println("Enter detailer name: ");
				String detailerName = in.next();
				
				System.out.println("Enter detailer phone number");
				int phoneNumber = in.nextInt();
				
				System.out.println("Detailer "+detailerName+" assigned");
				
				System.out.println("Enter car registration");
				String registration = in.next();
				
				System.out.println("Enter car make");
				String make = in.next();
				
				System.out.println("Enter car color");
				String color = in.next();
				
				detailer.setPhoneNumber(phoneNumber);
				detailer.setName(detailerName);
				
				car.setRegistration(registration);
				car.setMake(make);
				car.setDetailer(detailer);
				car.setColor(color);
				
				carArray[carsAdded] = car;
				carsAdded++;
				
				System.out.println("Car has been added");
				System.out.println(Arrays.toString(carArray));
					
				
			} else if (letter.equals("B")) {
				
				System.out.println("Enter car registration to update detailer info");
				String registrationToBeFound = in.next();
				
				System.out.println(Arrays.toString(carArray));
				
				boolean found= false;
				for(int i=0; i<carArray.length; i++) {
					
					if (registrationToBeFound.equals(carArray[i].getRegistration())) {
						found = true;
						indexCarFound = i;
						break;}
				}
				if(found) {
					System.out.println("Car found");
					System.out.println("Enter new detailer name: ");
					String newName = in.next();
					detailer.setName(newName);
					carArray[indexCarFound].setDetailer(detailer);
					
					System.out.println("Enter new detailer number: ");
					int newNumber = in.nextInt();
					detailer.setPhoneNumber(newNumber);
					System.out.println("Detailer "+detailer.getName()+" created and assigned");
							
		
					
						}else {
							
						System.out.println("Car not found");
						
					}
						
				
				
			}else if (letter.equals("C")) {
				
				System.out.println(Arrays.toString(carArray));
				
								
			} else if (letter.equals("N")) {
				
				close = true;
				
			} else { 
				System.out.print("wrong input");
				return;}
		}
		System.out.println(carsAdded+ " cars have been created");
		System.out.println("Good bye");
	}
	
}

