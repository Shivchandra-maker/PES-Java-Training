
class User{
	  	String name;
	    String phone;
	    String email;
	    char gender;
	    String addressLine;
	    String city;
	    String state; 
	    int zipCode;
	    
	    

	    User(){
	    	name = "Atmaram";
	    	phone = "+91 7777333 222";
	    	email = "atma@example.com";
	    	gender = 'M';
	    	addressLine = "Manohar Park";
	    	city = "Lucknow";
	    	state = "UP";
	    	zipCode = 1211;
	    }
	    


		void showdetails() {
	    	System.out.println("Name is "+ name +" Phone number is : "+phone+" email is : "+email);
	    }
}




public class Oops {
		
	public static void main(String[] args) {
		
		User usr = new User();
		usr.showdetails();
		
	}
}
