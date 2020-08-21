import java.util.ArrayList;


/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19023346, Aug 20, 2020 11:47:57 PM
 */

public class ESEPackageMain {

	public static final int ViewExistingPackage = 1;
	public static final int AddNewPackage = 2;
	public static final int DeletePackage = 3;
	public static final int QuitProgram = 4;
	

	
 public static void main(String[] args) {
	    
	   ArrayList<Package> packageList = new ArrayList<Package>();
	   
	    packageList.add(new Package("XMAS1", "Christmas Package 1", "10 November 2020", "30th December 2020",
	    		251));
		packageList.add(new Package("NY1", "New Year Package 1", "31st December 2020", "31st January 2021",
				202));
	   


	    int option = 0;
	    
	    while (option != 4) {
	    	ESEPackageMain.menu();
	    	option = Helper.readInt("Enter an option > ");
	    	
	    	if (option == ViewExistingPackage) {
				// Vanessa 19023346 , Display All Packages
				option1(packageList);

			} else if (option == AddNewPackage) {
				// Vanessa 19023346, Add New Package
				option2(packageList);

			} else if (option == DeletePackage) {
				// Vanessa 19023346, Delete Package
				option3(packageList);

			}else {
				System.out.println("Invalid Option!");
			}
	    	
	    }
		
	    
	}



	public static void menu() {
		ResourceCentre.setHeader("MANAGE PACKAGES");
		System.out.println("1. Display All Packages");
		System.out.println("2. Add Package");
		System.out.println("3. Delete Package");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}
	
	public static void option1(ArrayList<Package> packageList) {
		ESEPackageMain.viewAllPackages(packageList);
	}
	
	public static void option2(ArrayList<Package> packageList) {
		ESEPackageMain.setHeader("Add New Package");			

			Package NewPckg = createPackage();
			ESEPackageMain.addPackage(packageList, NewPckg);

	}
	
	public static void option3(ArrayList<Package> packageList) {
		ESEPackageMain.setHeader("Delete Package");			

   String delC = Helper.readString("Enter the code of the package to delete > ");
		
		for(int i=0;i<packageList.size();i++) {
			if(packageList.get(i).getPackageCode().contains(delC)) {
				packageList.remove(i);
				
				System.out.println("Package deleted!");
				
			}
			else {
				System.out.println("Package not found.");
			}
		}
		
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	public static String retrieveAllPackages(ArrayList<Package> packageList) {
		String output = "";
		for (int i = 0; i < packageList.size(); i++) {


		output += String.format("%-10s %-30s %-10s %-10s %-20d\n", packageList.get(i).getPackageCode(),
				packageList.get(i).getDescription(),
				packageList.get(i).getStartDate(),packageList.get(i).getEndDate(),
				packageList.get(i).getPackageAmt());
		}
		return output;}
	
	public static void viewAllPackages(ArrayList<Package> packageList) {
		ResourceCentre.setHeader("Package List");
		String output = String.format("%-10s %-30s %-10s %-10s %-20d\n", "Package Code", "Package Description",
				"Start Date", "End Date", "Package Amount");
		 output += retrieveAllPackages(packageList);	
		System.out.println(output);
	}
	
public static void addPackage(ArrayList<Package> packageList, Package NewPckg) {
		
		packageList.add(NewPckg);
		System.out.println("Package added!");
	}
	
	public static Package createPackage() {
		String PackageCode = Helper.readString("Enter Package Code > ");
		String PackageDesc = Helper.readString("Enter Package Description > ");
		String StartDate = Helper.readString("Enter Package Start Date > ");
		String EndDate = Helper.readString("Enter Package End Date > ");
		int PackageAmt = Helper.readInt("Enter Package Start Amount > $");

		
		Package pg= new Package(PackageCode, PackageDesc, StartDate, EndDate, PackageAmt);
		return pg;
		
	}	

     public static void delPackage(ArrayList<Package> packageList, Package delPckg) {
		
		packageList.remove(delPckg);
		System.out.println("Package deleted!");
	}
	

}
