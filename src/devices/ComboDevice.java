package devices;

public class ComboDevice extends Device implements Printer, Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		
	}

	@Override
	public String escaneado() {
		return "Combo esc: Documento escaneado";
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo - Documento impresso"+doc);
	}

	@Override
	public void proccesDoc(String doc) {
		System.out.println("Combo - Processando documento:"+doc);
	
		
	}
	
	

}
