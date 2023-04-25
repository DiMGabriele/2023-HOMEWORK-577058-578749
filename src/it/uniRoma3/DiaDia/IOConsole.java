package it.uniRoma3.DiaDia;


	import java.util.Scanner;
	
	
	public class IOConsole implements IO {
	public void mostraMessaggio(String messaggio) {
	System.out.println(messaggio);
	}
	public String leggiRiga() {
	Scanner scannerDiLinee = new Scanner(System.in);
	String riga = scannerDiLinee.nextLine();
	scannerDiLinee.close();
	return riga;
	}
	}

