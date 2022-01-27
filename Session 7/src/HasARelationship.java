class User {

	String name;
	String phone;
	String email;

	// 1 user has 1 address
	Address address; // Has-A Relationship (1 to 1)
	Order[] orders; // Has-A Relationship (1 to many)

	User() {

	}

	User(String name, String phone, String email, Address address, Order[] orders) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.orders = orders;
	}

	void showUser() {
		System.out.println("User Details:");
		System.out.println(name + " " + phone + " " + email);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		address.showAddress();

		System.out.println("Orders for User " + name);
		for (Order order : orders) {
			order.showOrder();
		}
	}

}

class Address {

	String addressLine;
	String city;
	String state;
	int zipCode;
	String label;

	Address() {

	}

	Address(String addressLine, String city, String state, int zipCode, String label) {
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.label = label;
	}

	void showAddress() {
		System.out.println("Address Details: ");
		System.out.println(addressLine + " " + city + " " + state + " " + zipCode + " " + label);
		System.out.println();
	}
}

class Order {

	int oid;
	String date;
	int amount;

	// Dish[] dishes; // implement this :)
	Dish[] dishes;

	Order() {

	}

	

	public Order(int oid, String date, int amount, Dish[] dishes) {
		super();
		this.oid = oid;
		this.date = date;
		this.amount = amount;
		this.dishes = dishes;
	}



	void showOrder() {
		System.out.println("Order Details: ");
		System.out.println(oid + " " + date + " " + amount);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int i=1;
		for(Dish dish: dishes) {
			System.out.println("Dish "+i+" details : ");
			dish.showDish();
			i++;
		}
	}
}

class Dish{
	
	String name;
	int amount;
	int quantity;
	
	Dish(){
		
	}

	public Dish(String name, int amount, int quantity) {
		super();
		this.name = name;
		this.amount = amount;
		this.quantity = quantity;
	}
	
	void showDish() {
		//System.out.println("Dish Details : ");
		System.out.println(name + " " + amount + " "+ quantity);
		System.out.println();
	}
	
	
}

public class HasARelationship {

	public static void main(String[] args) {

		/*
		Order o1 = new Order(1, "22nd Jan, 2022", 200);
		Order o2 = new Order(2, "24th Jan, 2022", 500);
		Order o3 = new Order(3, "26th Jan, 2022", 350);
		

		Order[] orders = { o1, o2, o3 }; // Array of Order Objects :)

		Address aRef = new Address("Redwood Shores", "Ludhiana", "Punjab", 141001, "WORK");
		User uRef = new User("John", "+91 99999 11111", "john@example.com", aRef, orders);

		uRef.showUser();
		*/

		// Assignment: For 1 Order we can have many Dishes
		// Complete the above program where you will link multiple Dish Objects with 1
		// Order :)
		
		Dish d1 = new Dish("Noodles",150, 1);
		Dish d2 = new Dish("Fries",50, 2);
		Dish d3 = new Dish("Cutlet",230, 4);
		Dish d4 = new Dish("Burger",20, 1);
		
		Dish[] dish = {d1, d2, d3, d4};
		
		Order or = new Order(1,"28th Jan 2022",200,dish);
		
		or.showOrder();
		
		
		
		

	}

}