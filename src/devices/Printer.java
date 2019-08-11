package devices;

public class Printer extends Device {

	public Printer(String serialNumber) {
		super(serialNumber);

	}

	@Override
	public void proccesDoc(String doc) {
		System.out.println("imprimindo "+doc);
		
	}
	
	public String print(String doc) {
		return ("documento impresso:"+doc);
	}

	
	
	
}
