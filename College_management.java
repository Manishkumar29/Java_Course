
public class College_management {
	
	String staff;
	String college;
	String gymkhana;
	String library;
	Integer college_idInteger;

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getGymkhana() {
		return gymkhana;
	}

	public void setGymkhana(String gymkhana) {
		this.gymkhana = gymkhana;
	}

	public String getLibrary() {
		return library;
	}

	public void setLibrary(String library) {
		this.library = library;
	}

	public Integer getCollege_idInteger() {
		return college_idInteger;
	}

	public void setCollege_idInteger(Integer college_idInteger) {
		this.college_idInteger = college_idInteger;
	}

	
	
	public College_management(String staff, String college, String gymkhana, String library,
			Integer college_idInteger) {
		super();
		this.staff = staff;
		this.college = college;
		this.gymkhana = gymkhana;
		this.library = library;
		this.college_idInteger = college_idInteger;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		College_management co = new College_management("Staff", "Shailendra", "Shailendra gymkhana", "library", 85);

				System.out.println(co.college_idInteger);
				System.out.println(co.staff);
				System.out.println(co.gymkhana);
				System.out.println();
				System.out.println();
				
		College_management lo = new College_management("Staffy", "Shailendra", "Shailendra gymkhana", "library", 001);
		System.out.println(lo.staff);
		
		College_management com = new College_management("Staff not present", "Thakur college", "Thakur gymkhana", "library avilable", 85);
		System.out.println(com.library);
		
		College_management cm = new College_management("Staff", "Shailendra", "Shailendra gymkhana", "library not avilable", 102);
		System.out.println(cm.college_idInteger);
		
		College_management sho = new College_management("Staff", "Rizvi COllege", "Rizvi gymkhana", "library jahan", 120);
		 
		System.out.println(sho.library);
		System.out.println(sho.college);
		System.out.println(sho.library);
				
	}

}
