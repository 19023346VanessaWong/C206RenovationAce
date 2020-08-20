import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Ariel 19013377 - user story - add customer 
	public static void addCustomer(ArrayList<Customer> customerList, Customer c) {
		
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

			output += String.format("%-10s %-10s %-20s %-10s\n", customerList.get(i).getName(), customerList.get(i).getRole()
					                 , customerList.get(i).getEmail(), customerList.get(i).getStatus());
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
			if(cname == customerList.get(i).getName()) {
				customerList.remove(i);
				
			}
			else {
				System.out.println("Customer not found.");
			}
		}
		
	}
}
