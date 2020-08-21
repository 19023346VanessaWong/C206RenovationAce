
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19023346, Aug 21, 2020 12:07:50 AM
 */

public class Package {

	private String PackageCode;
	private String PackageDesc;
	private String StartDate;
	private String EndDate;
	private int PackageAmt;

	public Package(String PackageCode, String PackageDesc, String StartDate, String EndDate, int packageAmt) {
		this.PackageCode = PackageCode;
		this.PackageDesc = PackageDesc;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
		this.PackageAmt = packageAmt;
		
	}
	
	public String toString() {
		
		
		String packageInfo = String.format("%-10d %-30s %-10s %-10s %-10.2f", 
				PackageCode, 
				PackageDesc, 
				StartDate,
				EndDate,
				PackageAmt
				);

		return packageInfo;
	}
	
	
	public String getPackageCode() {
		return PackageCode;
	}

	public String getDescription() {
		return PackageDesc;
	}

	public String getStartDate() {
		return StartDate;
	}
	
	public String getEndDate() {
		return EndDate;
	}
	
	public int getPackageAmt() {
		return PackageAmt;
	}


}
