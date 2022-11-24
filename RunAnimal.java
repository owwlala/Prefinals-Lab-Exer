import java.util.Scanner;
public class RunAnimal{
	public static void main(String[] args){
		
		Scanner ra = new Scanner(System.in);
		
		Bird b = new Bird();
		Cat c = new Cat();
		Dog d = new Dog();
		
		System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
			String bcd = ra.nextLine();
			
			if(bcd.equalsIgnoreCase("B")){
				b.eat();
				b.sleep();
				b.makeSound();
			}
			else if(bcd.equalsIgnoreCase("C")){
				c.eat();
				c.sleep();
				c.makeSound();
			}
			else if(bcd.equalsIgnoreCase("D")){
				d.eat();
				d.sleep();
				d.makeSound();
			}
			else{
				System.out.println("Invalid input!!");
			}
	}
}