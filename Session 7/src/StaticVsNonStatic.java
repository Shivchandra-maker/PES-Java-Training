class Food{
	
	// non static attributes -> property of object | resides inside the object as storage container
	String name;
	int price;
	int quantity;
	int totalprice;
	
	// static attributes -> property of class | resides inside the class as storage container
	static int totalQuantity;
	static int numOfFood;
	
	// static variables can be accessed by property of object :)
	
	Food(){
		numOfFood++;
	}
	
	Food(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		totalQuantity += quantity;
		numOfFood++;
	}
	
	void showDish() {
		System.out.println("Dish: "+name+" "+price+" "+quantity);
	}
	
	void increment() {
		quantity++;
		totalQuantity++;
	}
	
	void decrement() {
		quantity--;
		totalQuantity--;
	}
	
	// Property of Class
	// inside the static method we cannot access non static properties
	static void showDishData() {
		System.out.println("Number of Food: "+numOfFood);
		System.out.println("Total Quantity: "+totalQuantity);
		
		
		//decrement(); // error
		//System.out.println("name is: "+name); // error
	}
	
	int totalamount() {
		totalprice = quantity*price;
		return totalprice;
	}
	
	
	
}


public class StaticVsNonStatic{

	public static void main(String[] args) {
		
		Food dish1 = new Food("Noodles", 200, 1);
		Food dish2 = new Food("Burger", 100, 1);
		
		//Food dish3 = new Food();
		//Food dish4 = new Food("Fries", 80, 2);
		//Food dish5 = new Food();
		
		dish1.increment();
		dish1.increment();
		
		dish2.increment();
		dish2.increment();
		dish2.increment();
		
		dish1.decrement();
		
		dish1.showDish();
		dish2.showDish();
		
		
		Food.showDishData();
		int result = dish1.totalprice+dish2.totalprice;
		System.out.println("Toal Amount : "+result);
		
		
		
		
		/*
		
		// Assignment: 1. Alter the code above and make the totalPrice to reflect correct amount
		
		// Array of Integers
		//int[] array = {10, 20, 30, 40, 50};
		//int[] array = new int[5];
		
		// Array of Objects - Array of Dish Objects
		// Hence, after the discussion, it is basically array of references for the Dish Objects :)
		//Dish[] array = {dish1, dish2, dish3, dish4, dish5};
		Food[] array = new Food[5];
		array[0] = dish1;
		array[1] = dish2;
		array[2] = dish3;
		array[3] = new Food(); // :) rather than copying the reference, you can create directly the object
		array[4] = dish5;
		
		System.out.println("array is: "+array);
		
		System.out.println("Food:");
		for(int i=0;i<array.length;i++) {
			array[i].showDish();
		}
		
		*/
		
		
		// Assignment: 2. Sort the above dish array to show the Food in ascending order as per price
		//				  dish with lowest price comes first and highest in last

	}

}