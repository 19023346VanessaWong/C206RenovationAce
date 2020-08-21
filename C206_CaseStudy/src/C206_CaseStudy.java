import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		customerList.add(new Customer("Cindy Lim", "Customer", "cindylim@email.com","cindy12345", "new"));
		customerList.add(new Customer("Ashley Tan", "Customer", "ashleytan@email.com","ashley67890", "new"));
		
		int option = 0;
		int secondOption = 0;
		
		while(option!=9) {
			
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option >");
			
			if(option == 1) {
				
				System.out.println("");
				Helper.line(80, "-");
				System.out.println("CUSTOMER ACCOUNT");
				System.out.println("1. View all account");
				System.out.println("2. Add an account");
				System.out.println("3. Delete an account");
				System.out.println("");
				
				secondOption = Helper.readInt("Enter an option >");
				
				if(secondOption == 1) {
					C206_CaseStudy.viewAllCustomerList(customerList);
				}
				
				else if(secondOption == 2) {
					Customer c = inputCustomer();
					C206_CaseStudy.addCustomer(customerList, c);
					
				}
				else if(secondOption == 3) {
					C206_CaseStudy.deleteCustomer(customerList);
				}
			}
			else if(option==9) {
				System.out.println("Thank You. Bye!");
			}
			else {
				System.out.println("Invalid Option");
			}
			
		}
	
		
	
	
	
	
	
	
	
	}
	//Ariel 19013377 - user story - input details of customer account
	public static Customer inputCustomer() {
		String name = Helper.readString("Enter customer name > ");
		String role = Helper.readString("Enter role > ");
		String email = Helper.readString("Enter email address >");
		String password = Helper.readString("Enter account password >");
		String status = Helper.readString("Enter status >");

		Customer c = new Customer(name, role, email, password, status);
		return c;
		
	}
	
	
	//Ariel 19013377 - user story - add customer 
	public static void addCustomer(ArrayList<Customer> customerList, Customer c) {
		customerList.add(c);
		System.out.println("Customer added!");
		
	}
	
	
	public static void menu() {
		C206_CaseStudy.setHeader("C206 Case Study");
		System.out.println("1. User Account");
		System.out.println("2. Package");
		System.out.println("3. Request for quote");
		System.out.println("4. Quotation");
		System.out.println("5. Appointment");
		System.out.println("9. Quit");
		Helper.line(80, "-");

	}
	
	//Set up setHeader method 
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	
		
	}
	

	//Ariel 19013377 - Retrieve customer details from customer list
	public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
		
		String output = "";

		for (int i = 0; i < customerList.size(); i++) {

			output += String.format("%-10s %-10s %-20s %-10s\n", customerList.get(i).getName(), customerList.get(i).getRole(), customerList.get(i).getEmail(), customerList.get(i).getStatus());
		}
		return output;
	}
	
	//Ariel 19013377 - View all existed customers from customer list
	public static void viewAllCustomerList(ArrayList<Customer> customerList) {
		C206_CaseStudy.setHeader("CUSTOMER LIST");
		String output = String.format("%-10s %-10s %-20s %-10s\n", "NAME", "ROLE", "EMAIL", "STATUS");
		 output += retrieveAllCustomer(customerList);	
		System.out.println(output);

}
	//Ariel 19013377 - Delete user by name
	public static void deleteCustomer(ArrayList<Customer> customerList) {
		String cname = Helper.readString("Enter the name of the customer: ");
		
		for(int i=0;i<customerList.size();i++) {
			if(customerList.get(i).getName().contains(cname)){
				
				customerList.remove(i);
				
				System.out.println("Customer deleted!");
				
			}
			else {
				System.out.println("Customer not found.");
			}
		}
		
	}
}
