package Adapter;

public class Main {
	public static void main(String[] args) {
		
		Cleaner cleaner = new Cleaner();
		cleaner.connect();
		
		HairDryer hairDryer = new HairDryer();
		//hairDryer.connect();
		
		Electronic220V ad = new AdapterConnect(hairDryer);
		connect(ad);
		
	}
	
	public static void connect(Electronic220V electronic220) {
		electronic220.connect();
	}
}
