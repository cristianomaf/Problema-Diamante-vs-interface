package devices;


//classe extend de device e implementa a Classe Printer que é uma interface
public class PrinterDevice extends Device implements Printer {

	public PrinterDevice(String serialNumber) {
		super(serialNumber);

	}

	@Override
	public void proccesDoc(String doc) {
		System.out.println("imprimindo "+doc);
		
	}
	@Override
	public void print(String doc) {
		System.out.println("documento impresso:"+doc);
	}

	
	
	
}
