package application;

import java.util.Scanner;

import devices.ComboDevice;
import devices.PrinterDevice;
import devices.ScannerDevice;

public class Program {

	public static void main(String[] args) {
		String doc = "arquivo.doc";

		Scanner scan = new Scanner(System.in);

		System.out.print("Entre o numero serial:");
		String serialNumber = scan.next();

		System.out.println();
		System.out.println("***Scanner***");
		ScannerDevice n1 = new ScannerDevice(serialNumber);
		n1.proccesDoc(doc);
		System.out.println(n1.escaneado());
		
		System.out.println("***Impressora***");		
		PrinterDevice n2 = new PrinterDevice(serialNumber);
		n2.proccesDoc(doc);
		n2.print(doc);
		
		System.out.println("Combo Device");
		ComboDevice n3 = new ComboDevice(serialNumber);
		n3.proccesDoc(doc);
		System.out.println(n3.escaneado());
		n3.print(doc);
		

		scan.close();

	}

}
