package application;

import java.util.Scanner;

import devices.Printer;
import devices.ScannerDevice;

public class Program {

	public static void main(String[] args) {
		String doc = "arquivo.doc";

		Scanner scan = new Scanner(System.in);

		System.out.print("Entre o numero serial:");
		String serialNumber = scan.next();

		ScannerDevice n1 = new ScannerDevice(serialNumber);
		n1.proccesDoc(doc);
		System.out.println(n1.escaneado());
		
		Printer n2 = new Printer(serialNumber);
		n2.proccesDoc(doc);
		System.out.println(n2.print(doc));
		

		scan.close();

	}

}
