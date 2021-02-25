
public class Vehicle {
	
	private String brand;
	private int engine;
	private int seat;
	
  public Vehicle (String brand,int engine, int seat){
		this.brand=brand;
		this.engine = engine;
		this.seat = seat;
	}

   public String getbrand() {
	   return brand;
   }
   
   public int getengine() {
	   return engine;
   }

   public int getseat() {
	  return seat;
   }
}
