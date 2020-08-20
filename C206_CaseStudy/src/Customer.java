/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19013377, Aug 20, 2020 3:55:53 PM
 */

/**
 * @author 19013377
 *
 */
public class Customer {
	private String name;
	private String role;
	private String email;
	private String password;
	private String status;
	
	public Customer(String name, String role, String email, String password, String status) {
		this.name = name;
		this.role = name;
		this.email = email;
		this.password = password;
		this.status = status; 
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public String getEmail() {
		return email;
		
	}
	public String getPassword() {
		return password;
	}
	public String getStatus() {
		return status;
	}



}
