import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Customer c1; //Ariel
	private Customer c2; //Ariel
	
	private ArrayList<Customer> customerList; //Ariel
	
	public C206_CaseStudyTest () {
		super();
	}

	@Before
	public void setUp() throws Exception {
		c1 = new Customer ("Cindy Lim", "Customer", "cindylim@email.com", "cindy12345", "new"); //Ariel
		c2 = new Customer ("Ashley Tan", "Customer", "ashleytan@email.com", "ashley67890", "new"); //Ariel
		
		customerList = new ArrayList<Customer>();
	}
	
	@Test
	//Ariel - Junit test
	public void addCustomerTest() {
		//Check that there is available Customer List, so that new customer account can be added - boundary
		assertNotNull("Check if there is Customer List to add to ", customerList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addCustomer(customerList, c1);
		assertEquals("Check that Customer arraylist size is 1", 1, customerList.size());
		assertSame("Check that Customer is added", c1, customerList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addCustomer(customerList, c2);
		assertEquals("Check that Customer arraylist size is 2", 2, customerList.size());
		assertSame("Check that Customer is added", c2, customerList.get(1));
		
		
	}
	
	@Test
	//Ariel - Junit test
	public void retrieveAllCustomer() {
		//fail("Not yet implemented");
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Customer arraylist to retrieve customer account from", customerList);
				
		//test if the list of Customer retrieved from the SourceCentre is empty - boundary
		String allCustomer= C206_CaseStudy.retrieveAllCustomer(customerList);
		String testOutput = "";
		assertEquals("Test that the retrieved Customerlist is empty?", testOutput, allCustomer);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addCustomer(customerList, c1);
		C206_CaseStudy.addCustomer(customerList, c2);
		assertEquals("Test that customer arraylist size is 2", 2, customerList.size());
				
		//test if the expected output string same as the list of customers retrieved from the C206_CaseStudy
		allCustomer= C206_CaseStudy.retrieveAllCustomer(customerList);
		testOutput = String.format("%-10s %-10s %-20s %-20s %-10s\n","Cindy Lim", "Customer", "cindylim@email.com","cindy12345", "new");
		testOutput += String.format("%-10s %-10s %-20s %-20s %-10s\n","Ashley Tan", "Customer", "ashleytan@email.com","ashley67890", "new");	
		assertEquals("Test that ViewAllCustomerList", testOutput, allCustomer);
	}
	
	@Test
	//Ariel - Junit test
	public void deleteCustomer() {
		//fail("Not yet implemented");
		// Test if Item list is not null but empty - boundary
		assertNotNull("Test if there is valid Customer arraylist to delete customer account from", customerList);
		
	}

	@After
	public void tearDown() throws Exception {
		c1 = null;
		c2 = null;
		customerList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
