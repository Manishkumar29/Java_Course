
//calling varibaleles using getter and setters method

public class Animal {

	String height ;
	String length ;
	String sound ;
	String weight ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	String name;
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	
	
	public Animal(String height, String length, String sound, String weight, String name) {
		super();
		this.height = height;
		this.length = length;
		this.sound = sound;
		this.weight = weight;
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//using contructor method with fieds
		Animal rat = new Animal("10cm", "12cm", "chew", "100g", "chuha");
				System.out.println(rat.name);
				
		
// object
				/*
				 * Animal a = new Animal();
				 * 
				 * a.setName("Lion"); a.setHeight("190cm"); a.setLength("150cm");
				 * a.setSound("loud"); a.setWeight("200kg"); System.out.println(a.getName());
				 * System.out.println(a.getHeight()); System.out.println(a.getLength());
				 * System.out.println(a.getSound()); System.out.println(a.getWeight());
				 * 
				 * System.out.println("Next Animal "); System.out.println(""); Animal dog = new
				 * Animal(); dog.setName("Redbull"); dog.setHeight("30cm");
				 * dog.setLength("60cm"); dog.setSound("Bark"); dog.setWeight("30kg");
				 * 
				 * System.out.println(dog.getName()); System.out.println(dog.getHeight());
				 * System.out.println(dog.getLength()); System.out.println(dog.getSound());
				 * System.out.println(dog.getWeight());
				 * 
				 * Animal don = new Animal(); don.setName("Petbull"); don.setHeight("40cm");
				 * don.setLength("80cm"); don.setSound("Bar"); don.setWeight("40kg");
				 * 
				 * System.out.println(don.getName()); System.out.println(don.getHeight());
				 * System.out.println(don.getLength()); System.out.println(don.getSound());
				 * System.out.println(don.getWeight());
				 * 
				 * Animal dosn = new Animal(); dosn.setName("Kaliya"); dosn.setHeight("50cm");
				 * dosn.setLength("80cm"); dosn.setSound("Baro"); dosn.setWeight("50kg");
				 * 
				 * System.out.println(dosn.getName()); System.out.println(dosn.getHeight());
				 * System.out.println(dosn.getLength()); System.out.println(dosn.getSound());
				 * System.out.println(dosn.getWeight());
				 * 
				 * Animal dosno = new Animal(); dosno.setName("WOlf"); dosno.setHeight("90cm");
				 * dosno.setLength("20cm"); dosno.setSound("Barok"); dosno.setWeight("90kg");
				 * 
				 * System.out.println(dosno.getName()); System.out.println(dosno.getHeight());
				 * System.out.println(dosno.getLength()); System.out.println(dosno.getSound());
				 * System.out.println(dosno.getWeight());
				 */
	}

}
