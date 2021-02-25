
public class Truck extends Vehicle {
	
	private String musicsystem;
	private String aircondisner;
	
	public Truck(String musicsystem,String aircondisner,String brand,int engine,int seat){
		super(brand,engine,seat);
		this.musicsystem = musicsystem;
		this.aircondisner= aircondisner;
	}

	public String getmusicSystem() {
	   return musicsystem;
	}
	static String printMe() {
		return "Truck";
	}
	public String getaircondisner()  {
		return aircondisner;
	}
}
