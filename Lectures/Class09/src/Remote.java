
public class Remote {

	public static void main(String[] args) {
		//Creating an object of TV class
		TV tv = new TV();
		tv.turnOn();
		tv.setChannel(25);
		tv.setVolume(50);
		
		tv.info();
		
		tv.turnOff();
		
		tv.info();

	}

}
