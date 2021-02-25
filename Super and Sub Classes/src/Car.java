
public class Car extends Vehicle{
	
	private String Gear;
	private String door;
	
	public Car(String brand, int engine, int seat) {
		super(brand, engine, seat);
	}

	public Car(String brand,int engine, int seat,String Gear,String door){
		super(brand,engine,seat);
		this.Gear = Gear;
		this.door = door;
	}
	
	public String getGear() {
		return Gear;
	}
    
	public String getdoor() {
		return door;
	}
//	static String printMe() {
//		  return "I am car";
//	  }
}
