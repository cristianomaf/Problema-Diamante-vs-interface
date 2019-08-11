package devices;

public class ScannerDevice extends Device implements Scanner{

	public ScannerDevice(String serialNumber) {
		super(serialNumber);		
	}
	
	@Override
	public void proccesDoc(String doc) {
		System.out.println("Processando "+doc);
		
	}
	
	public String escaneado() {
		return ("Conteudo Escaneado");
	}

}
